package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.W2r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70094W2r {
    public Dialog A00;
    public DialogInterface.OnDismissListener A01;
    public final Activity A02;
    public final Fragment A03;
    public final UserSession A04;
    public final List A05;

    public static CharSequence[] A00(C70094W2r c70094W2r) {
        ArrayList arrayList = new ArrayList();
        for (C6ZL c6zl : c70094W2r.A05) {
            if (c6zl.A08()) {
                if (c6zl instanceof AbstractC141066Zk) {
                    arrayList.addAll(((AbstractC141066Zk) c6zl).A0A());
                } else {
                    arrayList.add(c6zl.A03());
                }
            }
        }
        return (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]);
    }

    public C70094W2r(Activity activity, DialogInterface.OnDismissListener onDismissListener, Fragment fragment, UserSession userSession, List list) {
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = fragment;
        this.A05 = list;
        this.A01 = onDismissListener;
    }
}
