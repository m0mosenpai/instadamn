package X;

import android.content.Context;
import com.facebook.R;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Fs9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35833Fs9 implements InterfaceC48192Ji {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C40701ud A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;

    public C35833Fs9(Context context, C40701ud c40701ud, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        this.A05 = interfaceC16660sJ;
        this.A04 = interfaceC16660sJ2;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = c40701ud;
        this.A00 = context;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        InterfaceC16660sJ interfaceC16660sJ;
        C2JS A0k;
        C2JS A03;
        ImmutableList A06;
        C2JS c2js;
        C2JS A032;
        C2JS optionalTreeField;
        String A07;
        C211739Zk c211739Zk = null;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A03 = A0k.A03(C59670Qjo.class, AbstractC58317Pt9.A00(1097), 1103989981)) != null && (A06 = A03.A06(C59669Qjn.class, "edges", -1466994003)) != null && (c2js = (C2JS) AbstractC001800i.A0J(A06)) != null && (A032 = c2js.A03(C59668Qjm.class, "node", 1470725096)) != null && (optionalTreeField = A032.getOptionalTreeField(1, "content", C59667Qjl.class, 1552357277)) != null && (A07 = optionalTreeField.A07(AbstractC58317Pt9.A00(910))) != null) {
            c211739Zk = new C211739Zk(A07, Integer.valueOf(R.drawable.instagram_users_pano_outline_24));
            String str = this.A03;
            String str2 = this.A02;
            C40701ud c40701ud = this.A01;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A04;
            Context context = this.A00;
            c211739Zk.A00 = 2131969486;
            c211739Zk.A02 = true;
            c211739Zk.A01 = new G80(context, c211739Zk, c40701ud, str, str2, interfaceC16660sJ2);
            interfaceC16660sJ = this.A05;
        } else {
            interfaceC16660sJ = this.A04;
        }
        interfaceC16660sJ.invoke(c211739Zk);
    }
}
