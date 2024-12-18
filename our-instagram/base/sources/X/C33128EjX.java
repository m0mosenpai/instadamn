package X;

import android.widget.CompoundButton;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.EjX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33128EjX extends AbstractC32533EUj {
    public final CompoundButton A00;
    public final C33621EtX A01;
    public final boolean A02;
    public final boolean A03;
    public final /* synthetic */ C33244Ele A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33128EjX(CompoundButton compoundButton, AbstractC10360h2 abstractC10360h2, C33621EtX c33621EtX, C33244Ele c33244Ele, boolean z, boolean z2) {
        super(abstractC10360h2);
        this.A04 = c33244Ele;
        this.A00 = compoundButton;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = c33621EtX;
    }

    private void A01(boolean z) {
        String str;
        C33244Ele c33244Ele = this.A04;
        C35033Fc6 c35033Fc6 = c33244Ele.A07;
        String str2 = c33244Ele.A08;
        boolean z2 = this.A03;
        C33621EtX c33621EtX = this.A01;
        if (z2) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        c35033Fc6.A02(str2, AnonymousClass001.A0g(str, "-", c33621EtX.toString()), "time_range", z);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(828962329);
        C33244Ele c33244Ele = this.A04;
        C9GR.A0C(c33244Ele.A04, "reset_time_range_failed");
        boolean z = this.A02;
        CompoundButton compoundButton = this.A00;
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(null);
            compoundButton.setChecked(z);
            compoundButton.setOnCheckedChangeListener(c33244Ele.A05);
        }
        A01(false);
        C0f9.A0A(2142955562, A03);
    }

    @Override // X.C1P1
    public final void onSuccess(Object obj) {
        int A03 = C0f9.A03(1250290171);
        boolean z = this.A03;
        CompoundButton compoundButton = this.A00;
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(null);
            compoundButton.setChecked(z);
            compoundButton.setOnCheckedChangeListener(this.A04.A05);
        }
        FRN frn = this.A04.A06.A00;
        FHV fhv = frn.A00;
        fhv.getClass();
        frn.A00(fhv);
        A01(true);
        C0f9.A0A(2135034843, A03);
    }
}
