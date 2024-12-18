package X;

/* loaded from: classes11.dex */
public final class WFT {
    public double A00;
    public long A01;
    public String A02;
    public boolean A03;
    public String A04;

    public static String A00(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1838656495:
                    str2 = "STRING";
                    break;
                case 72655:
                    str2 = "INT";
                    break;
                case 2044650:
                    str2 = "BOOL";
                    break;
                case 66988604:
                    str2 = "FLOAT";
                    break;
            }
            if (str.equals(str2)) {
                return str;
            }
        }
        return null;
    }

    public final long A01() {
        String str = this.A02;
        if (str.equals("INT")) {
            return this.A01;
        }
        if (str.equals("FLOAT")) {
            return (long) this.A00;
        }
        throw new Exception("Invalid value type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String toString() {
        String str = this.A04;
        if (str == null) {
            String str2 = this.A02;
            switch (str2.hashCode()) {
                case 72655:
                    if (str2.equals("INT")) {
                        str = String.valueOf(this.A01);
                        break;
                    }
                    str = "n/a";
                    break;
                case 2044650:
                    if (str2.equals("BOOL")) {
                        str = String.valueOf(this.A03);
                        break;
                    }
                    str = "n/a";
                    break;
                case 66988604:
                    if (str2.equals("FLOAT")) {
                        str = String.valueOf(this.A00);
                        break;
                    }
                    str = "n/a";
                    break;
                default:
                    str = "n/a";
                    break;
            }
            this.A04 = str;
        }
        return str;
    }

    public WFT(int i) {
        this.A02 = "INT";
        this.A01 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0010. Please report as an issue. */
    public WFT(String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                str = "NULL";
            } else {
                switch (str.hashCode()) {
                    case -1838656495:
                        if (str.equals("STRING")) {
                            this.A04 = str2;
                            break;
                        }
                        break;
                    case 72655:
                        if (str.equals("INT")) {
                            try {
                                this.A01 = Long.parseLong(str2);
                                break;
                            } catch (NumberFormatException unused) {
                                throw new VI3("Invalid integer", str2);
                            }
                        }
                        break;
                    case 2044650:
                        if (str.equals("BOOL")) {
                            if (!str2.equals("true") && !str2.equals("false")) {
                                throw new VI3("Invalid boolean", str2);
                            }
                            this.A03 = Boolean.parseBoolean(str2);
                            break;
                        }
                        break;
                    case 66988604:
                        if (str.equals("FLOAT")) {
                            try {
                                this.A00 = Double.parseDouble(str2);
                                break;
                            } catch (NumberFormatException unused2) {
                                throw new VI3("Invalid float", str2);
                            }
                        }
                        break;
                }
            }
            this.A02 = str;
            return;
        }
        throw new Exception("Invalid value type");
    }

    public WFT(String str) {
        this.A02 = "STRING";
        this.A04 = str;
    }

    public WFT(double d) {
        this.A02 = "FLOAT";
        this.A00 = d;
    }
}
