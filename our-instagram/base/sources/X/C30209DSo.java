package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.DSo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30209DSo extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30209DSo(InterfaceC11380iw interfaceC11380iw, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(2);
        this.A02 = interfaceC16820sZ;
        this.A01 = str;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-548489636, "com.instagram.opal.impl.ui.OpalFloatingSwitchButton.createOpalFloatingSwitchButton.<anonymous> (OpalFloatingSwitchButton.kt:68)");
            }
            InterfaceC16820sZ interfaceC16820sZ = this.A02;
            String str = this.A01;
            boolean z = this.A04;
            boolean z2 = this.A03;
            AbstractC27681CJa.A00(c5Tl, Modifier.A00, this.A00, str, interfaceC16820sZ, 196608, z, z2);
            if (C0fH.A02()) {
                C0fH.A00(-911865392);
            }
        }
        return C0eB.A00;
    }
}
