package X;

import android.graphics.Bitmap;

/* renamed from: X.AhR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23872AhR implements InterfaceC25187BCk {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C183328Bf A02;
    public final /* synthetic */ C8Ba A03;
    public final /* synthetic */ C115475Kh A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16620sF A07;
    public final /* synthetic */ InterfaceC16620sF A08;

    @Override // X.InterfaceC25187BCk
    public final void DIS(Bitmap bitmap) {
        C183328Bf c183328Bf = this.A02;
        C183298Bb c183298Bb = c183328Bf.A03;
        String str = this.A05;
        int i = this.A01;
        C14360o3.A0B(str, 0);
        C183308Bd c183308Bd = c183298Bb.A08;
        c183308Bd.put(new C206369Bt(str, i, 2), bitmap);
        c183298Bb.A07.A0B(c183308Bd);
        InterfaceC16620sF interfaceC16620sF = this.A07;
        InterfaceC16620sF interfaceC16620sF2 = this.A08;
        if (interfaceC16620sF2 != null) {
            if (C18U.A06(C06090Tz.A05, c183328Bf.A01, 36315417368136933L)) {
                interfaceC16620sF2.invoke(bitmap, str);
                this.A06.invoke();
            }
        }
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(bitmap, str);
        }
        this.A06.invoke();
    }

    public C23872AhR(C183328Bf c183328Bf, C8Ba c8Ba, C115475Kh c115475Kh, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, int i, boolean z) {
        this.A02 = c183328Bf;
        this.A05 = str;
        this.A01 = i;
        this.A07 = interfaceC16620sF;
        this.A08 = interfaceC16620sF2;
        this.A06 = interfaceC16820sZ;
        this.A04 = c115475Kh;
        this.A03 = c8Ba;
        this.A00 = z;
    }

    @Override // X.InterfaceC25187BCk
    public final void DIT() {
        if (!this.A00) {
            this.A00 = true;
            C183328Bf c183328Bf = this.A02;
            C115475Kh c115475Kh = this.A04;
            int i = this.A01;
            C183328Bf.A01(c183328Bf, this.A03, c115475Kh, this.A05, new C9GQ(c183328Bf, 6), this.A07, this.A08, i, true, false);
            return;
        }
        this.A06.invoke();
    }
}
