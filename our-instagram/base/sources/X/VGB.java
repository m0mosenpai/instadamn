package X;

import java.util.Locale;

/* loaded from: classes11.dex */
public enum VGB {
    TOP_LEFT("top_left"),
    TOP_RIGHT("top_right"),
    BOTTOM_LEFT("bottom_left"),
    BOTTOM_RIGHT("bottom_right");

    public final String A00;

    public static VGB A00(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.US);
            switch (lowerCase.hashCode()) {
                case -966253391:
                    if (lowerCase.equals("top_left")) {
                        return TOP_LEFT;
                    }
                    break;
                case -609197669:
                    if (lowerCase.equals("bottom_left")) {
                        return BOTTOM_LEFT;
                    }
                    break;
                case 116576946:
                    if (lowerCase.equals("top_right")) {
                        return TOP_RIGHT;
                    }
                    break;
            }
        }
        return BOTTOM_RIGHT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    VGB(String str) {
        this.A00 = str;
    }
}
