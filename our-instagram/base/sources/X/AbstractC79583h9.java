package X;

/* renamed from: X.3h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79583h9 {
    public static final void A00(C2WC c2wc, C2WC c2wc2, Object obj) {
        if (obj instanceof C2WS) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\n            Trying to mount a RenderTreeNode, its parent should be a Host, but was '");
        sb.append(obj.getClass().getSimpleName());
        sb.append("'.\n            Parent RenderUnit: id=");
        sb.append(c2wc2.A0H());
        sb.append("; poolKey='");
        sb.append(c2wc2.A0I().BeR());
        sb.append("'.\n            Child RenderUnit: id=");
        sb.append(c2wc.A0H());
        sb.append("; poolKey='");
        sb.append(c2wc.A0I().BeR());
        sb.append("'.\n            ");
        throw new RuntimeException(AbstractC16490ru.A0p(sb.toString()));
    }
}
