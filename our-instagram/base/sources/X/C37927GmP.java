package X;

import android.os.Parcelable;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GmP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37927GmP extends C17T implements C68C {
    @Override // X.C68C
    public final C68B ExQ(C1DY c1dy) {
        List<ImmutablePandoUserDict> A0o = A0o(2093024461, ImmutablePandoUserDict.class);
        ArrayList A0i = AbstractC167007dF.A0i(A0o);
        for (ImmutablePandoUserDict immutablePandoUserDict : A0o) {
            Parcelable.Creator creator = User.CREATOR;
            A0i.add(AbstractC38851rI.A01(c1dy, immutablePandoUserDict));
        }
        ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
        Iterator it = A0i.iterator();
        while (it.hasNext()) {
            A0i2.add(c1dy.A00((User) it.next()));
        }
        return new C68B(A0i2);
    }
}
