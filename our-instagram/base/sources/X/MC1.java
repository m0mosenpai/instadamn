package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes8.dex */
public final class MC1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 0;
    public final Object A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC1(C33151Eju c33151Eju, String str, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = c33151Eju;
        this.A06 = str;
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, String str, boolean z) {
        interfaceC02590Ai.AAP("event_name", str);
        C0Zx c0Zx = new C0Zx();
        c0Zx.A03("from_search", Boolean.valueOf(z));
        c0Zx.A03("from_select_all", false);
        c0Zx.A03("from_profile", false);
        interfaceC02590Ai.AAQ(c0Zx, "event_data");
        interfaceC02590Ai.A8R(null, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A04 != 0) {
            String str = this.A06;
            return new MC1((C38687GzS) this.A02, (C25810BbR) this.A05, str, interfaceC23621Ds, this.A00, this.A03);
        }
        return new MC1((C33151Eju) this.A05, this.A06, interfaceC23621Ds);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a9, code lost:
    
        if (r8 == r12) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MC1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MC1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC1(C38687GzS c38687GzS, C25810BbR c25810BbR, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A06 = str;
        this.A05 = c25810BbR;
        this.A00 = i;
        this.A02 = c38687GzS;
        this.A03 = z;
    }
}
