package X;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class PUL implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PUL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x01c8: INVOKE (r1 I:android.database.Cursor) INTERFACE call: android.database.Cursor.close():void A[MD:():void (c)] (LINE:456), block:B:87:0x01c8 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01cb: INVOKE (r3 I:X.1ov) VIRTUAL call: X.1ov.A00():void A[MD:():void (m)] (LINE:459), block:B:87:0x01c8 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Cursor close;
        C1YP c1yp;
        Object obj;
        C37581ov c37581ov;
        Cursor A00;
        Object A17;
        try {
            try {
                switch (this.A00) {
                    case 0:
                        C2PZ c2pz = (C2PZ) this.A01;
                        c1yp = c2pz.A01;
                        c1yp.beginTransaction();
                        c2pz.A00.insert((C51603Mqv) this.A02);
                        c1yp.setTransactionSuccessful();
                        obj = C0eB.A00;
                        return obj;
                    case 1:
                        C51603Mqv c51603Mqv = null;
                        close = C3EP.A00(((C2PZ) this.A01).A01, (C37581ov) this.A02, false);
                        try {
                            int A01 = AbstractC37601ox.A01(close, "media_id");
                            int A012 = AbstractC37601ox.A01(close, "file_path");
                            int A013 = AbstractC37601ox.A01(close, "file_size");
                            int A014 = AbstractC37601ox.A01(close, "last_used_time_ms");
                            if (close.moveToFirst()) {
                                c51603Mqv = new C51603Mqv(close.getLong(A013), close.getString(A01), close.getLong(A014), close.getString(A012));
                            }
                            return c51603Mqv;
                        } finally {
                        }
                    case 2:
                        close = C3EP.A00(((C2PZ) this.A01).A01, (C37581ov) this.A02, false);
                        try {
                            int A015 = AbstractC37601ox.A01(close, "media_id");
                            int A016 = AbstractC37601ox.A01(close, "file_path");
                            int A017 = AbstractC37601ox.A01(close, "file_size");
                            int A018 = AbstractC37601ox.A01(close, "last_used_time_ms");
                            ArrayList A172 = AbstractC25225BEi.A17(close.getCount());
                            while (close.moveToNext()) {
                                A172.add(new C51603Mqv(close.getLong(A017), close.getString(A015), close.getLong(A018), close.getString(A016)));
                            }
                            return A172;
                        } finally {
                        }
                    case 3:
                        C1YP c1yp2 = ((C2PZ) this.A01).A01;
                        c37581ov = (C37581ov) this.A02;
                        A00 = C3EP.A00(c1yp2, c37581ov, false);
                        A17 = AbstractC25225BEi.A17(A00.getCount());
                        while (A00.moveToNext()) {
                            A17.add(A00.getString(0));
                        }
                        A00.close();
                        c37581ov.A00();
                        return A17;
                    case 4:
                        P0G p0g = (P0G) this.A02;
                        C54402O2i c54402O2i = p0g.A0A;
                        UserSession userSession = p0g.A06;
                        View view = (View) this.A01;
                        C14360o3.A0B(view, 1);
                        C5SW c5sw = c54402O2i.A00;
                        if (c5sw == null) {
                            Context context = view.getContext();
                            AbstractC31171DnF.A1O(context);
                            C5SU A0U = AbstractC167007dF.A0U((Activity) context, 2131957484);
                            A0U.A0F = true;
                            A0U.A03(view);
                            A0U.A01();
                            A0U.A0A = true;
                            A0U.A0B = true;
                            c5sw = NMC.A00(A0U, userSession, 4);
                            c54402O2i.A00 = c5sw;
                        }
                        if (c5sw != null) {
                            c5sw.A06();
                            return true;
                        }
                        throw AbstractC166997dE.A0g();
                    case 5:
                        C56342P0d c56342P0d = (C56342P0d) this.A02;
                        C52369NFj c52369NFj = c56342P0d.A00;
                        if (c52369NFj == null) {
                            C14360o3.A0F("exclusivePostsRow");
                            throw C00O.createAndThrow();
                        }
                        TextView textView = c52369NFj.A06;
                        if (textView != null) {
                            Object obj2 = this.A01;
                            FragmentActivity requireActivity = c56342P0d.A01.requireActivity();
                            UserSession userSession2 = c56342P0d.A02;
                            C5SU A0U2 = AbstractC167007dF.A0U(requireActivity, 2131961971);
                            A0U2.A0F = true;
                            A0U2.A03(textView);
                            A0U2.A01();
                            A0U2.A0A = true;
                            NMC.A00(A0U2, obj2, 5).A07(userSession2);
                        }
                        return AbstractC166997dE.A0b();
                    case 6:
                        C1YP c1yp3 = ((MXP) this.A01).A02;
                        c37581ov = (C37581ov) this.A02;
                        A00 = C3EP.A00(c1yp3, c37581ov, false);
                        if (A00.moveToFirst()) {
                            A17 = Integer.valueOf(A00.getInt(0));
                        } else {
                            A17 = 0;
                        }
                        A00.close();
                        c37581ov.A00();
                        return A17;
                    case 7:
                        C1YP c1yp4 = ((MXP) this.A01).A02;
                        c37581ov = (C37581ov) this.A02;
                        A17 = 0;
                        A00 = C3EP.A00(c1yp4, c37581ov, false);
                        if (A00.moveToFirst()) {
                            A17 = A00.getString(0);
                        }
                        A00.close();
                        c37581ov.A00();
                        return A17;
                    case 8:
                        C1YP c1yp5 = ((MXP) this.A01).A02;
                        c37581ov = (C37581ov) this.A02;
                        A00 = C3EP.A00(c1yp5, c37581ov, false);
                        A17 = AbstractC25225BEi.A17(A00.getCount());
                        while (A00.moveToNext()) {
                            A17.add(A00.getString(0));
                        }
                        A00.close();
                        c37581ov.A00();
                        return A17;
                    case 9:
                        MXP mxp = (MXP) this.A01;
                        c1yp = mxp.A02;
                        c1yp.beginTransaction();
                        obj = Long.valueOf(mxp.A01.insertAndReturnId((C51682MsD) this.A02));
                        c1yp.setTransactionSuccessful();
                        return obj;
                    case 10:
                        MXP mxp2 = (MXP) this.A01;
                        c1yp = mxp2.A02;
                        c1yp.beginTransaction();
                        mxp2.A00.A00((C51682MsD) this.A02);
                        c1yp.setTransactionSuccessful();
                        obj = C0eB.A00;
                        return obj;
                    default:
                        C1YP c1yp6 = ((LJY) this.A01).A01;
                        c37581ov = (C37581ov) this.A02;
                        A00 = C3EP.A00(c1yp6, c37581ov, false);
                        if (A00.moveToFirst()) {
                            A17 = Integer.valueOf(A00.getInt(0));
                        } else {
                            A17 = 0;
                        }
                        A00.close();
                        c37581ov.A00();
                        return A17;
                }
            } finally {
                c1yp.endTransaction();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
