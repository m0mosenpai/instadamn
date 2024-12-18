package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes8.dex */
public final class KTJ extends AbstractC129515tG implements InterfaceC129555tK {
    public final C7QL A00;
    public final CharSequence A01;
    public final Integer A02;
    public final C7QX A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTJ(C7QX c7qx, C7QL c7ql, CharSequence charSequence, Integer num) {
        super(c7qx);
        C14360o3.A0B(charSequence, 1);
        this.A01 = charSequence;
        this.A02 = num;
        this.A00 = c7ql;
        this.A03 = c7qx;
    }

    @Override // X.AbstractC129515tG, X.InterfaceC129525tH
    public final boolean ARd() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTJ) {
                KTJ ktj = (KTJ) obj;
                if (!C14360o3.A0K(this.A01, ktj.A01) || this.A02 != ktj.A02 || !C14360o3.A0K(this.A00, ktj.A00) || !C14360o3.A0K(this.A03, ktj.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0G = AbstractC166987dD.A0G(this.A01);
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "TAP";
                break;
            case 1:
                str = "TAP_AND_HOLD";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return AbstractC166987dD.A0I(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC25231BEo.A0H(str, intValue, A0G)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HiddenMessageContentViewModel(messageText=");
        A1C.append((Object) this.A01);
        A1C.append(", revealAction=");
        switch (this.A02.intValue()) {
            case 0:
                str = "TAP";
                break;
            case 1:
                str = "TAP_AND_HOLD";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        A1C.append(str);
        A1C.append(", themeModel=");
        A1C.append(this.A00);
        A1C.append(", gestureDetectionModel=");
        return AbstractC167017dG.A0o(this.A03, A1C);
    }
}
