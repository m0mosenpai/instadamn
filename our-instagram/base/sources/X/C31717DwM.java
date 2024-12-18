package X;

import java.util.AbstractCollection;

/* renamed from: X.DwM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31717DwM extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MessagesAndStoryRepliesFragment";
    public final C35119FeM A00 = new C35119FeM(true);
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966383);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
    
        if (X.JUW.A02(X.AbstractC166987dD.A0r(r3), true) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0094, code lost:
    
        r2.add(r5);
        X.C31335Dq0.A03(r2, 2131966382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x009d, code lost:
    
        if (r8 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        A00(r16, r2, 11, 2131968865);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        if (X.C18U.A06(r6, X.AbstractC166987dD.A0o(r3), 36322748875680198L) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b6, code lost:
    
        A00(r16, r2, 12, 2131953434);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        r1 = X.AbstractC31175DnJ.A0K(r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cc, code lost:
    
        if (X.AbstractC31177DnL.A1Z(X.AbstractC47132Ef.A00(r1).A07) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d6, code lost:
    
        if (X.C6CE.A00(r1).A00() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x011c, code lost:
    
        if (X.C18U.A06(r6, X.AbstractC166987dD.A0o(r3), 36327868476832694L) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
    
        r2.add(r5);
        X.C31335Dq0.A03(r2, 2131966380);
        A00(r16, r2, 5, 2131954153);
        X.AbstractC34073F2b.A00(r16, X.AbstractC31175DnJ.A0K(r3, 0), com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_VALUE, "impression", "button", null, X.AbstractC167007dF.A0n("is_bloks", "0"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0144, code lost:
    
        setItems(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0147, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d8, code lost:
    
        r2.add(r5);
        X.C31335Dq0.A03(r2, 2131961860);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
    
        if (X.C6CE.A00(X.AbstractC166987dD.A0r(r3)).A00() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        A00(r16, r2, 13, 2131961858);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0105, code lost:
    
        if (X.AbstractC31177DnL.A1Z(X.AbstractC47132Ef.A00(X.AbstractC166987dD.A0r(r3)).A07) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0107, code lost:
    
        A00(r16, r2, 14, 2131961859);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if (X.C18U.A06(r6, X.AbstractC166987dD.A0o(r3), 36322748875680198L) != false) goto L14;
     */
    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31717DwM.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C35200Ffs(new ViewOnClickListenerC35689FpO(obj, i), i2));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }
}
