package X;

import com.facebook.common.mindeputils.IVerboseDebuggable;

/* renamed from: X.0Qu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05450Qu implements IVerboseDebuggable {
    public static final C03720In A05 = new C03720In("ActivityLifecycleCodes");
    public EnumC05430Qs A00 = EnumC05430Qs.A0F;
    public AbstractC05460Qv[] A01 = null;
    public final Class A02;
    public final String A03;
    public final AbstractC05460Qv[] A04;

    public final void A00(StringBuilder sb) {
        AbstractC05460Qv[] abstractC05460QvArr = this.A04;
        AbstractC05460Qv[] abstractC05460QvArr2 = this.A01;
        if (abstractC05460QvArr2 != null) {
            sb.append("Proccessed codes");
            abstractC05460QvArr = abstractC05460QvArr2;
        } else {
            sb.append("Potential codes");
        }
        sb.append(": [");
        for (AbstractC05460Qv abstractC05460Qv : abstractC05460QvArr) {
            if (abstractC05460Qv != null) {
                sb.append(abstractC05460Qv.A02());
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC03770Is.A01(this.A03));
        sb.append(" ");
        sb.append(this.A00.A03);
        sb.append(" ");
        A00(sb);
        return sb.toString();
    }

    public AbstractC05450Qu(String str, AbstractC05460Qv... abstractC05460QvArr) {
        this.A03 = str;
        abstractC05460QvArr.getClass();
        this.A04 = abstractC05460QvArr;
        this.A02 = abstractC05460QvArr.getClass();
    }
}
