package X;

import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes6.dex */
public final class GI9 implements GYY {
    public final /* synthetic */ C36473G6x A00;

    public GI9(C36473G6x c36473G6x) {
        this.A00 = c36473G6x;
    }

    @Override // X.GYY
    public final void Dqz(String str) {
        C36473G6x c36473G6x = this.A00;
        DirectShareTarget directShareTarget = c36473G6x.A00;
        if (directShareTarget != null) {
            String str2 = directShareTarget.A0J;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equalsIgnoreCase(str2)) {
                c36473G6x.A09.add(AbstractC31173DnH.A0o(directShareTarget));
            }
            ((C35151Fet) c36473G6x.A06.A01).A05.DdF(directShareTarget);
        }
    }
}
