package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.7AZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AZ implements C7QB {
    public final boolean A00;

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void D8a(Object obj) {
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
    }

    public final C158657Ab A00(InterfaceC165247aD interfaceC165247aD) {
        return new C158657Ab(interfaceC165247aD, this.A00);
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
        C7QD c7qd = (C7QD) obj;
        InterfaceC129525tH interfaceC129525tH = (InterfaceC129525tH) obj2;
        if (!this.A00) {
            InterfaceC1581778c interfaceC1581778c = (InterfaceC1581778c) c7qd;
            if (interfaceC1581778c.Afy() != null) {
                ImageView Afy = interfaceC1581778c.Afy();
                View BKF = c7qd.BKF();
                String str = interfaceC129525tH.BSy().A01;
                String A00 = interfaceC129525tH.BSy().A00();
                if (Afy.getTag(R.id.direct_heart_animator) != null && ((TextUtils.isEmpty(str) || Afy.getTag(R.id.direct_heart_attached_message_id) == null || !Afy.getTag(R.id.direct_heart_attached_message_id).equals(str)) && (TextUtils.isEmpty(A00) || Afy.getTag(R.id.direct_heart_attached_message_client_context) == null || !Afy.getTag(R.id.direct_heart_attached_message_client_context).equals(A00)))) {
                    ((C131325wL) Afy.getTag(R.id.direct_heart_animator)).A00(null);
                    Afy.setScaleX(0.0f);
                    Afy.setScaleY(0.0f);
                    Afy.setAlpha(0.0f);
                    Afy.setTag(R.id.direct_heart_attached_message_id, null);
                    Afy.setTag(R.id.direct_heart_attached_message_client_context, null);
                }
                BKF.addOnAttachStateChangeListener(new AQ7(BKF, Afy));
            }
        }
    }

    public C7AZ(boolean z) {
        this.A00 = z;
    }
}
