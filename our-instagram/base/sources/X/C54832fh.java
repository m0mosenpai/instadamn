package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54832fh {
    public float A00;
    public boolean A01;
    public final InterfaceC09390do A02;

    public C54832fh(final Activity activity, final UserSession userSession) {
        this.A02 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2fi
            @Override // X.InterfaceC16820sZ
            public final /* bridge */ /* synthetic */ Object invoke() {
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                return new C62882tR(activity, new C25600BTn(this), userSession, 23592973);
            }
        });
    }
}
