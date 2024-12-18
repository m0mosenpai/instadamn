package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.MediaNoticeIcon;

/* renamed from: X.DUe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30251DUe extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ MediaNoticeIcon A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30251DUe(Modifier modifier, MediaNoticeIcon mediaNoticeIcon, String str, String str2, String str3, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        super(2);
        this.A03 = mediaNoticeIcon;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A07 = interfaceC16660sJ;
        this.A02 = modifier;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        CE9.A00(AbstractC25226BEj.A0S(obj, obj2), this.A02, this.A03, this.A06, this.A05, this.A04, this.A07, AbstractC25225BEi.A04(this.A00), this.A01);
        return C0eB.A00;
    }
}
