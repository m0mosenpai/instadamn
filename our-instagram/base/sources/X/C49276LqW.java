package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.TreeMap;

/* renamed from: X.LqW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49276LqW implements InterfaceC50511MRo {
    public final AbstractC49502Ph A00;
    public final AbstractC29571bY A01;
    public final C1YP A02;
    public final AbstractC29601bb A03;
    public final AbstractC29601bb A04;
    public final AbstractC29601bb A05;
    public final AbstractC29601bb A06;
    public final AbstractC29601bb A07;
    public final AbstractC29601bb A08;

    @Override // X.InterfaceC50511MRo
    public final C45091JxL AVW(String str, int i) {
        C45091JxL c45091JxL;
        Long A0f;
        Long A0f2;
        String string;
        String string2;
        String string3;
        Long A0f3;
        Double valueOf;
        Double valueOf2;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("\n    SELECT *\n    FROM security_alert\n    WHERE user_id = ?\n      AND device_id = ?\n      AND device_change_type = 2\n    ORDER BY created_timestamp_ms DESC\n    LIMIT 1\n  ", 2);
        A00.ADp(1, str);
        Cursor A002 = A00(A00, this, 2, i);
        try {
            int A01 = AbstractC37601ox.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A012 = AbstractC37601ox.A01(A002, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A013 = AbstractC37601ox.A01(A002, "crypto_mailbox_type");
            int A014 = AbstractC37601ox.A01(A002, "device_change_type");
            int A015 = AbstractC37601ox.A01(A002, AbstractC31688Dvt.A01());
            int A016 = AbstractC37601ox.A01(A002, "created_timestamp_ms");
            int A017 = AbstractC37601ox.A01(A002, "first_read_timestamp_ms");
            int A018 = AbstractC37601ox.A01(A002, "model");
            int A019 = AbstractC37601ox.A01(A002, "platform");
            int A0110 = AbstractC37601ox.A01(A002, "location");
            int A0111 = AbstractC37601ox.A01(A002, "activity_feed_read_timestamp_ms");
            int A0112 = AbstractC37601ox.A01(A002, Location.LATITUDE);
            int A0113 = AbstractC37601ox.A01(A002, "longitude");
            int A0114 = AbstractC37601ox.A01(A002, "is_confirm");
            if (A002.moveToFirst()) {
                String string4 = A002.getString(A01);
                String string5 = A002.getString(A012);
                int i2 = A002.getInt(A013);
                int i3 = A002.getInt(A014);
                int i4 = A002.getInt(A015);
                if (A002.isNull(A016)) {
                    A0f = null;
                } else {
                    A0f = JQ0.A0f(A002, A016);
                }
                if (A002.isNull(A017)) {
                    A0f2 = null;
                } else {
                    A0f2 = JQ0.A0f(A002, A017);
                }
                if (A002.isNull(A018)) {
                    string = null;
                } else {
                    string = A002.getString(A018);
                }
                if (A002.isNull(A019)) {
                    string2 = null;
                } else {
                    string2 = A002.getString(A019);
                }
                if (A002.isNull(A0110)) {
                    string3 = null;
                } else {
                    string3 = A002.getString(A0110);
                }
                if (A002.isNull(A0111)) {
                    A0f3 = null;
                } else {
                    A0f3 = JQ0.A0f(A002, A0111);
                }
                if (A002.isNull(A0112)) {
                    valueOf = null;
                } else {
                    valueOf = Double.valueOf(A002.getDouble(A0112));
                }
                if (A002.isNull(A0113)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Double.valueOf(A002.getDouble(A0113));
                }
                c45091JxL = new C45091JxL(valueOf, valueOf2, A0f, A0f2, A0f3, string4, string5, string, string2, string3, i2, i3, i4, AbstractC167007dF.A1M(A002.getInt(A0114)));
            } else {
                c45091JxL = null;
            }
            return c45091JxL;
        } finally {
            A002.close();
            A00.A00();
        }
    }

    public C49276LqW(C1YP c1yp) {
        this.A02 = c1yp;
        this.A01 = new C43906JbH(c1yp, this, 4);
        this.A00 = new C44798JsL(c1yp, this, 1);
        this.A08 = new C44083Je8(c1yp, this, 10);
        this.A03 = new C44083Je8(c1yp, this, 11);
        this.A07 = new C44083Je8(c1yp, this, 12);
        this.A06 = new C44083Je8(c1yp, this, 13);
        this.A04 = new C44083Je8(c1yp, this, 14);
        this.A05 = new C44083Je8(c1yp, this, 15);
    }

    public static Cursor A00(C37581ov c37581ov, C49276LqW c49276LqW, int i, long j) {
        c37581ov.ADi(i, j);
        C1YP c1yp = c49276LqW.A02;
        c1yp.assertNotSuspendingTransaction();
        return c1yp.query(c37581ov, (CancellationSignal) null);
    }
}
