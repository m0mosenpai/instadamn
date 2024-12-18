package X;

import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;

/* loaded from: classes8.dex */
public final class L6X {
    public final /* synthetic */ KCU A00;

    public L6X(KCU kcu) {
        this.A00 = kcu;
    }

    public final void A00(int i, String str) {
        LatLng A0L;
        KCU kcu = this.A00;
        KCU.A02(kcu, i);
        C45999KXn A0e = AbstractC43593JPy.A0e(kcu);
        LJ4 lj4 = A0e.A06;
        Integer num = C05F.A00;
        C45103JxX c45103JxX = null;
        if (lj4.A02(num).A01) {
            String A1A = AbstractC25228BEl.A1A(str);
            NoteAudience noteAudience = C45293K2v.A02(A0e).A01;
            Location A01 = C45999KXn.A01(A0e);
            if (A01 != null && (A0L = AbstractC43594JPz.A0L(A01)) != null) {
                c45103JxX = new C45103JxX((Boolean) false, (float) A0L.A00, (float) A0L.A01);
            }
            C45999KXn.A0B(new C45119Jxo(noteAudience, new C45099JxT(null, null, c45103JxX, null, null, null, null, null, null), NoteCreationSource.A04, NoteStyle.A0D, A1A, C16930sl.A00), A0e, AbstractC25228BEl.A1A(str), true);
            return;
        }
        A0e.A0M(new C49433Lt7(null));
        C45999KXn.A06(null, A0e, num, C50242MGx.A00);
    }
}
