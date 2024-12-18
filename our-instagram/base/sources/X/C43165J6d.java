package X;

import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.overflowmenu.ClipsMashupInfoApiUtil$createRetriableMashupInfoForClipJob$1", f = "ClipsMashupInfoApiUtil.kt", i = {0}, l = {52}, m = "invokeSuspend", n = {"retryCount"}, s = {"I$0"})
/* renamed from: X.J6d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43165J6d extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43165J6d(UserSession userSession, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = userSession;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new C43165J6d(this.A02, this.A03, this.A04, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002a -> B:4:0x000c). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A01
            r5 = 1
            if (r0 == 0) goto L14
            int r4 = r7.A00
            X.AbstractC09560e7.A00(r8)
        Lc:
            boolean r0 = r8 instanceof X.C194848jk
            if (r0 == 0) goto L13
            r0 = 3
            if (r4 < r0) goto L18
        L13:
            return r8
        L14:
            X.AbstractC09560e7.A00(r8)
            r4 = 0
        L18:
            int r4 = r4 + 1
            X.IeA r3 = X.C41738IeA.A00
            com.instagram.common.session.UserSession r2 = r7.A02
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r7.A04
            r7.A00 = r4
            r7.A01 = r5
            java.lang.Object r8 = X.C41738IeA.A00(r2, r3, r1, r0, r7)
            if (r8 != r6) goto Lc
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43165J6d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C43165J6d) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
