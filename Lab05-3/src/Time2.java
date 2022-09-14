public class Time2 {
	private int second;

	public Time2() {
		this(0, 0, 0);
	}

	public Time2(int second) {
		this(second, 0, 0);
	}

	public Time2(int second, int minute) {
		this(second, minute, 0);
	}

	public Time2(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");

		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");

		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");

		this.second = hour * 3600 + minute * 60 + second;
	}

	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
	}

	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");

		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");

		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");

		this.second = hour * 3600 + minute * 60 + second;
	}

	public void setHour(int hour) {
		if (second < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");

		this.second += hour * 3600;
	}

	public void setMinute(int minute) {
		if (second < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");

		this.second += minute * 60;
	}

	public void setSecond(int second) {
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");

		this.second += second;
	}

	public int getHour() {
		return second / 3600;
	}

	public int getMinute() {
		return second % 3600 / 60;
	}

	public int getSecond() {
		return second % 60;
	}

	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}