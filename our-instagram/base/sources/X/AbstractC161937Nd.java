package X;

/* renamed from: X.7Nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161937Nd {
    public static final C161957Nf A00(C206289Bl c206289Bl, String str, String str2, long j) {
        String str3;
        Integer num;
        C14360o3.A0B(c206289Bl, 0);
        String A04 = A04((Integer) c206289Bl.A04);
        String A01 = A01((Integer) c206289Bl.A01);
        String A03 = A03((Integer) c206289Bl.A03);
        String A02 = A02((Integer) c206289Bl.A02);
        C161947Ne c161947Ne = (C161947Ne) c206289Bl.A05;
        if (c161947Ne != null && (num = c161947Ne.A02) != null) {
            switch (num.intValue()) {
                case 1:
                    str3 = "FLUSH_APPEND";
                    break;
                case 2:
                    str3 = "DURATION_BASED";
                    break;
                default:
                    str3 = "APPEND";
                    break;
            }
        } else {
            str3 = null;
        }
        return new C161957Nf(A04, A01, A03, A02, str3, ((EnumC161927Nc) c206289Bl.A06).name(), str, str2, j);
    }

    public static final String A01(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unspecified";
            }
            if (intValue == 1) {
                return "anticipation";
            }
            if (intValue == 2) {
                return "care";
            }
            if (intValue == 3) {
                return "confused";
            }
            if (intValue == 4) {
                return "laugh";
            }
            if (intValue == 5) {
                return "like";
            }
            if (intValue == 6) {
                return "look_up";
            }
            if (intValue == 7) {
                return "lookat_keyboard";
            }
            if (intValue == 8) {
                return "love";
            }
            if (intValue == 9) {
                return "neutral";
            }
            if (intValue == 10) {
                return "pensive";
            }
            if (intValue == 11) {
                return "puffing";
            }
            if (intValue == 12) {
                return "raise_eyebrows";
            }
            if (intValue == 13) {
                return "sad";
            }
            if (intValue == 14) {
                return "subtle_smile";
            }
            if (intValue == 15) {
                return "surprise";
            }
            if (intValue == 16) {
                return "upset";
            }
            if (intValue == 17) {
                return "waiting";
            }
            if (intValue == 18) {
                return "waiting_nod";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("botAction_");
        sb.append(num);
        return sb.toString();
    }

    public static final String A02(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unspecified";
            }
            if (intValue == 1) {
                return "high";
            }
            if (intValue == 2) {
                return "medium";
            }
            if (intValue == 3) {
                return "weak";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("intensity_");
        sb.append(num);
        return sb.toString();
    }

    public static final String A03(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unspecified";
            }
            if (intValue == 1) {
                return "affirmative";
            }
            if (intValue == 2) {
                return "angry";
            }
            if (intValue == 3) {
                return "annoyed";
            }
            if (intValue == 4) {
                return "bored";
            }
            if (intValue == 5) {
                return "confused";
            }
            if (intValue == 6) {
                return "content";
            }
            if (intValue == 7) {
                return "disagreeing";
            }
            if (intValue == 8) {
                return "disbelief";
            }
            if (intValue == 9) {
                return "disgusted";
            }
            if (intValue == 10) {
                return "empathic";
            }
            if (intValue == 11) {
                return "enthusiastic";
            }
            if (intValue == 12) {
                return "expectant";
            }
            if (intValue == 13) {
                return "fearful";
            }
            if (intValue == 14) {
                return "funny";
            }
            if (intValue == 15) {
                return "happy";
            }
            if (intValue == 16) {
                return "humored";
            }
            if (intValue == 17) {
                return "impatient";
            }
            if (intValue == 18) {
                return "interested";
            }
            if (intValue == 19) {
                return "irony";
            }
            if (intValue == 20) {
                return "neutral";
            }
            if (intValue == 21) {
                return "polite";
            }
            if (intValue == 22) {
                return "sad";
            }
            if (intValue == 23) {
                return "surprised";
            }
            if (intValue == 24) {
                return "sympathetic";
            }
            if (intValue == 25) {
                return "thinking";
            }
            if (intValue == 26) {
                return "tired";
            }
            if (intValue == 27) {
                return "upset";
            }
            if (intValue == 28) {
                return "wondering";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("sentiment_");
        sb.append(num);
        return sb.toString();
    }

    public static final String A04(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return "unknown";
            }
            if (intValue == 1) {
                return "ambient";
            }
            if (intValue == 2) {
                return "engaged";
            }
            if (intValue == 3) {
                return "responding";
            }
            if (intValue == 4) {
                return "thinking";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state_");
        sb.append(num);
        return sb.toString();
    }
}
