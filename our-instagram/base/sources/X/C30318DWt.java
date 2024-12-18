package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.GuidanceTipResponse;
import com.instagram.opal.impl.data.OpalProfileData;

/* renamed from: X.DWt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30318DWt extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30318DWt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2, boolean z) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A0A = z;
        this.A05 = obj3;
        this.A08 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A09 = obj7;
        this.A04 = obj8;
        this.A01 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        if (i != 0) {
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A05;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
            InterfaceC16620sF interfaceC16620sF2 = (InterfaceC16620sF) this.A09;
            InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A08;
            OpalProfileData opalProfileData = (OpalProfileData) this.A06;
            boolean z = this.A0A;
            AbstractC28507Ci0.A03(A0S, (Modifier) this.A03, (C51745MtU) this.A07, (InterfaceC11380iw) this.A02, opalProfileData, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF, interfaceC16620sF2, AbstractC25225BEi.A04(this.A01), z);
        } else {
            AchievementIntf achievementIntf = (AchievementIntf) this.A02;
            GuidanceTipResponse guidanceTipResponse = (GuidanceTipResponse) this.A03;
            boolean z2 = this.A0A;
            AbstractC27642CHn.A00(A0S, achievementIntf, guidanceTipResponse, (Boolean) this.A04, (InterfaceC16820sZ) this.A05, (InterfaceC16660sJ) this.A08, (InterfaceC16660sJ) this.A06, (InterfaceC16660sJ) this.A07, (InterfaceC16620sF) this.A09, AbstractC25225BEi.A04(this.A01), z2);
        }
        return C0eB.A00;
    }
}
