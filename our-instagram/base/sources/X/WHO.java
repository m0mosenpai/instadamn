package X;

import android.content.DialogInterface;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* loaded from: classes11.dex */
public final class WHO implements DialogInterface.OnClickListener {
    public final /* synthetic */ C70094W2r A00;

    public WHO(C70094W2r c70094W2r) {
        this.A00 = c70094W2r;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        User user;
        String str;
        dialogInterface.dismiss();
        C70094W2r c70094W2r = this.A00;
        CharSequence charSequence = C70094W2r.A00(c70094W2r)[i];
        for (C6ZL c6zl : c70094W2r.A05) {
            boolean z = c6zl instanceof AbstractC141066Zk;
            boolean A08 = c6zl.A08();
            if (z) {
                if (A08) {
                    AbstractC141066Zk abstractC141066Zk = (AbstractC141066Zk) c6zl;
                    if (abstractC141066Zk.A0A().contains(charSequence)) {
                        String charSequence2 = charSequence.toString();
                        C14360o3.A0B(charSequence2, 0);
                        C38321qM c38321qM = abstractC141066Zk.A00.A0b;
                        if (c38321qM != null) {
                            abstractC141066Zk.A07(c38321qM);
                            C141056Zj c141056Zj = (C141056Zj) abstractC141066Zk;
                            List A0Q = AbstractC001900j.A0Q(charSequence2, new char[]{' '}, 0);
                            if (!(A0Q instanceof Collection) || !A0Q.isEmpty()) {
                                for (Object obj : A0Q) {
                                    user = c141056Zj.A06;
                                    if (user != null) {
                                        str = user.getUsername();
                                    } else {
                                        str = null;
                                    }
                                    if (C14360o3.A0K(obj, str)) {
                                        break;
                                    }
                                }
                            }
                            user = c141056Zj.A05;
                            if (user != null) {
                                c141056Zj.A04.DIa(user);
                            }
                        }
                    }
                }
            } else if (A08 && c6zl.A03().equals(charSequence)) {
                c6zl.A06();
                return;
            }
        }
    }
}
