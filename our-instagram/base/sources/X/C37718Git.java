package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.repository.ClipsHeadMediaInsertionHelper$maybeRequestSourceMedia$1", f = "ClipsHeadMediaInsertionHelper.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.Git, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37718Git extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ ClipsViewerSource A01;
    public final /* synthetic */ C37615GhA A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37718Git(ClipsViewerSource clipsViewerSource, C37615GhA c37615GhA, String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A02 = c37615GhA;
        this.A01 = clipsViewerSource;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A08 = z;
        this.A07 = str4;
        this.A06 = str5;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C37615GhA c37615GhA = this.A02;
        return new C37718Git(this.A01, c37615GhA, this.A03, this.A05, this.A04, this.A07, this.A06, interfaceC23621Ds, this.A08);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C37615GhA c37615GhA = this.A02;
            ClipsViewerSource clipsViewerSource = this.A01;
            String str2 = this.A03;
            String str3 = this.A05;
            String str4 = this.A04;
            boolean z = this.A08;
            String str5 = this.A07;
            String str6 = this.A06;
            UserSession userSession = c37615GhA.A03;
            C008302x c008302x = null;
            if (AbstractC37619GhE.A00(clipsViewerSource, userSession, Boolean.valueOf(AbstractC167007dF.A1W(AbstractC25229BEm.A0h(userSession, str3))), str2, str5, null, z)) {
                if (str4 != null) {
                    str3 = AbstractC47024Kqh.A00(str4);
                }
                if (str3 != null) {
                    C38801rC c38801rC = C38321qM.A0h;
                    str = C38801rC.A06(str3);
                } else {
                    str = null;
                }
                c37615GhA.A00 = str;
                C1ON A01 = C37615GhA.A01(c37615GhA, str6);
                if (A01 != null) {
                    c008302x = A01.A05(1368380687, 2);
                }
            }
            this.A00 = 1;
            if (C37615GhA.A02(c37615GhA, this, c008302x) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C37718Git) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
