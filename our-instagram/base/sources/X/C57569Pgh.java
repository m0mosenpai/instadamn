package X;

import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.commonavatarliveediting.CdlProviderImpl$generateAvatar$2$1$1$1;

/* renamed from: X.Pgh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57569Pgh extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CdlProviderImpl A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16620sF A04;
    public final /* synthetic */ C19L A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57569Pgh(CdlProviderImpl cdlProviderImpl, String str, String str2, InterfaceC16620sF interfaceC16620sF, C19L c19l, long j) {
        super(1);
        this.A05 = c19l;
        this.A01 = cdlProviderImpl;
        this.A00 = j;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AbstractC53424NkD abstractC53424NkD = (AbstractC53424NkD) obj;
        C14360o3.A0B(abstractC53424NkD, 0);
        AbstractC166987dD.A1Z(new CdlProviderImpl$generateAvatar$2$1$1$1(abstractC53424NkD, this.A01, this.A03, this.A02, null, this.A04, this.A00), this.A05);
        return C0eB.A00;
    }
}
