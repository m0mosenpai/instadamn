package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.LoP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49146LoP implements C7QB {
    public final /* synthetic */ C7ZT A00;

    public C49146LoP(C7ZT c7zt) {
        this.A00 = c7zt;
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
        C2EY Ar9;
        C7QY c7qy = (C7QY) obj2;
        if (c7qy != null) {
            DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
            String str = ((MessageIdentifier) directMessageIdentifier).A01;
            String str2 = c7qy.A0Y;
            if (str2 != null || (str2 = c7qy.A0T) != null || ((Ar9 = c7qy.Ar9()) != null && (str2 = Ar9.toString()) != null)) {
                AbstractC43594JPz.A1K(c7qy, this.A00, directMessageIdentifier, str, str2);
            }
        }
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void D8a(Object obj) {
        View A01;
        C1579477e c1579477e = (C1579477e) obj;
        if (c1579477e != null && (A01 = c1579477e.A0G.A01()) != null) {
            A01.setLayoutParams(new LinearLayout.LayoutParams(330, 330));
        }
    }

    @Override // X.C7QB
    public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
    }
}