package X;

/* renamed from: X.VXd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68602VXd {
    public static final Integer A00(String str) {
        if (str != null) {
            if (!AbstractC001900j.A0a(str, "ig_self_injury_direct_message", false) && !AbstractC001900j.A0a(str, "ig_suicide_self_harm_eating_disorder_direct_message", false)) {
                if (!AbstractC001900j.A0a(str, "ig_nudity_direct_message", false) && !AbstractC001900j.A0a(str, "ig_nudity_direct_message_v2", false)) {
                    Integer num = C05F.A0j;
                    if (!AbstractC001900j.A0a(str, "ig_bullying_or_harassment_direct_message", false) && !AbstractC001900j.A0a(str, "ig_bullying_harassment_or_abuse_direct_message", false)) {
                        if (!AbstractC001900j.A0a(str, "ig_product_scam_fraud_reportable", false) && !AbstractC001900j.A0a(str, "ig_scam_or_spam_direct_message", false)) {
                            if (AbstractC001900j.A0a(str, "ig_hate_speech_direct_message", false)) {
                                return num;
                            }
                        } else {
                            return C05F.A0Y;
                        }
                    } else {
                        return C05F.A0C;
                    }
                } else {
                    return C05F.A01;
                }
            } else {
                return C05F.A0N;
            }
        }
        return C05F.A00;
    }
}
