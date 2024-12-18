package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DcZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30552DcZ extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C69R A00;
    public final /* synthetic */ InterfaceC132185xw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30552DcZ(C69R c69r, InterfaceC132185xw interfaceC132185xw, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        super(3);
        this.A00 = c69r;
        this.A01 = interfaceC132185xw;
        this.A02 = str;
        this.A03 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C69P c69p;
        InterfaceC119655bO interfaceC119655bO = (InterfaceC119655bO) obj;
        C5Tl c5Tl = (C5Tl) obj2;
        int A0H = AbstractC166987dD.A0H(obj3);
        C14360o3.A0B(interfaceC119655bO, 0);
        if ((A0H & 6) == 0) {
            A0H |= AbstractC25232BEp.A0R(c5Tl, interfaceC119655bO);
        }
        if ((A0H & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-551174178, "com.instagram.barcelona.feed.post.ui.PostSingleMedia.<anonymous>.<anonymous> (PostSingleMedia.kt:430)");
            }
            C69R c69r = this.A00;
            if (C9BG.A00(c69r, 2)) {
                c69p = (C69P) ((C9BG) c69r).A01;
            } else {
                c69p = new C69P(((C136906Ht) this.A01).A01);
            }
            String str = this.A02;
            c5Tl.Eno(1357656755);
            if (str == null) {
                str = C5YD.A00(c5Tl, 2131953718);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC136656Gu.A00(c5Tl, null, interfaceC119655bO.Cng(Modifier.A00), null, C5YJ.A00, c69p, str, this.A03, this.A04, this.A05, 0.0f, 12582912, 0, 1856, 0L);
            if (C0fH.A02()) {
                C0fH.A00(195596026);
            }
        }
        return C0eB.A00;
    }
}
