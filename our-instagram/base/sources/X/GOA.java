package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes6.dex */
public final class GOA implements Runnable {
    public final /* synthetic */ C34435FFz A00;
    public final /* synthetic */ String A01;

    public GOA(C34435FFz c34435FFz, String str) {
        this.A00 = c34435FFz;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34435FFz c34435FFz = this.A00;
        String str = this.A01;
        C36010Fv8 c36010Fv8 = c34435FFz.A00;
        if (c36010Fv8.A02.A02 != null) {
            C36303Fzy c36303Fzy = c36010Fv8.A0F;
            C34721FRi c34721FRi = c36303Fzy.A01;
            if (c34721FRi != null) {
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34721FRi.A0E, "messaging_ai_agent_feedback");
                if (A0f.isSampled()) {
                    C0Zx c0Zx = new C0Zx();
                    c0Zx.A01(EnumC33449Eqk.IGD_UNIVERSAL_SEARCH, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    AbstractC166997dE.A1N(A0f, "action_type", 1);
                    AbstractC166997dE.A1N(A0f, "view_name", 35);
                    A0f.AAQ(c0Zx, "feedback");
                    A0f.Cht();
                }
            }
            c36303Fzy.A05(7);
            c36303Fzy.A05(6);
            C36684GFe c36684GFe = c36010Fv8.A02;
            int A02 = c36684GFe.A0P.A02(c36684GFe.A02);
            C36684GFe c36684GFe2 = c36010Fv8.A02;
            c36684GFe2.A02.A00 = true;
            c36684GFe2.A07 = str;
            c36684GFe2.A0P.notifyItemChanged(A02);
        }
    }
}
