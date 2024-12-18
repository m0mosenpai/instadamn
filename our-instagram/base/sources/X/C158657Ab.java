package X;

import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.R;
import java.lang.ref.WeakReference;

/* renamed from: X.7Ab, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158657Ab extends C7Q7 {
    public final /* synthetic */ boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158657Ab(InterfaceC165247aD interfaceC165247aD, boolean z) {
        super(interfaceC165247aD);
        this.A00 = z;
    }

    @Override // X.C7Q7
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final boolean A01(InterfaceC129525tH interfaceC129525tH, C7QD c7qd) {
        C131325wL c131325wL;
        Object c24140AnP;
        if (!this.A00) {
            InterfaceC1581778c interfaceC1581778c = (InterfaceC1581778c) c7qd;
            if (interfaceC1581778c.Afy() != null) {
                ImageView Afy = interfaceC1581778c.Afy();
                String str = interfaceC129525tH.BSy().A01;
                String A00 = interfaceC129525tH.BSy().A00();
                if (Afy.getTag(R.id.direct_heart_animator) != null) {
                    c131325wL = (C131325wL) Afy.getTag(R.id.direct_heart_animator);
                } else {
                    c131325wL = new C131325wL();
                    Afy.setTag(R.id.direct_heart_animator, c131325wL);
                }
                if (Afy.getTag(R.id.direct_heart_animation_listener) != null) {
                    c24140AnP = Afy.getTag(R.id.direct_heart_animation_listener);
                } else {
                    c24140AnP = new C24140AnP(Afy);
                    Afy.setTag(R.id.direct_heart_animation_listener, c24140AnP);
                }
                c131325wL.A00(new WeakReference(c24140AnP));
                if (!TextUtils.isEmpty(str)) {
                    Afy.setTag(R.id.direct_heart_attached_message_id, str);
                }
                if (!TextUtils.isEmpty(A00)) {
                    Afy.setTag(R.id.direct_heart_attached_message_client_context, A00);
                }
                c131325wL.A02(false, true, true);
            }
        }
        return super.A01(interfaceC129525tH, c7qd);
    }
}
