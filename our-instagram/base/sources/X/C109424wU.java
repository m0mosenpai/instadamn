package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.4wU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109424wU {
    public final C1YP A00;
    public final AbstractC29601bb A01;
    public final AbstractC29601bb A02;
    public final AbstractC29601bb A03;
    public final AbstractC49502Ph A04;
    public final AbstractC29571bY A05;

    public final C109504wc A00(String str) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("\n    SELECT *\n    FROM newfeedstory\n    WHERE id = ?\n    ORDER BY timestamp ASC\n  ", 1);
        A00.ADp(1, str);
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        C109504wc c109504wc = null;
        Long l = null;
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            int A01 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A012 = AbstractC37601ox.A01(query, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A013 = AbstractC37601ox.A01(query, "notification_type");
            int A014 = AbstractC37601ox.A01(query, "timestamp");
            int A015 = AbstractC37601ox.A01(query, "first_impression_timestamp");
            int A016 = AbstractC37601ox.A01(query, "impression_count");
            int A017 = AbstractC37601ox.A01(query, "priority_section_eligibility");
            int A018 = AbstractC37601ox.A01(query, "major_app_version");
            int A019 = AbstractC37601ox.A01(query, "data");
            if (query.moveToFirst()) {
                String string = query.getString(A01);
                String string2 = query.getString(A012);
                int i = query.getInt(A013);
                long j = query.getLong(A014);
                if (!query.isNull(A015)) {
                    l = Long.valueOf(query.getLong(A015));
                }
                Long l2 = l;
                int i2 = query.getInt(A016);
                boolean z = false;
                if (query.getInt(A017) != 0) {
                    z = true;
                }
                c109504wc = new C109504wc(l2, string, string2, query.getBlob(A019), i, i2, query.getInt(A018), j, z);
            }
            return c109504wc;
        } finally {
            query.close();
            A00.A00();
        }
    }

    public final ArrayList A01(String str, List list, long j, long j2) {
        Long valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("    SELECT *");
        sb.append("\n");
        sb.append("    FROM newfeedstory");
        sb.append("\n");
        sb.append("    WHERE user_id = ");
        sb.append("?");
        sb.append(" ");
        sb.append("\n");
        sb.append("        AND timestamp >= ");
        sb.append("?");
        sb.append(" ");
        sb.append("\n");
        sb.append("        AND timestamp <= ");
        sb.append("?");
        sb.append(" ");
        sb.append("\n");
        sb.append("        AND notification_type IN (");
        int size = list.size();
        AbstractC73723Sa.A00(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("    ORDER BY timestamp ASC");
        sb.append("\n");
        sb.append("  ");
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00(sb.toString(), size + 3);
        A00.ADp(1, str);
        A00.ADi(2, j);
        A00.ADi(3, j2);
        Iterator it = list.iterator();
        int i = 4;
        while (it.hasNext()) {
            A00.ADi(i, ((Number) it.next()).intValue());
            i++;
        }
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            int A01 = AbstractC37601ox.A01(query, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            int A012 = AbstractC37601ox.A01(query, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A013 = AbstractC37601ox.A01(query, "notification_type");
            int A014 = AbstractC37601ox.A01(query, "timestamp");
            int A015 = AbstractC37601ox.A01(query, "first_impression_timestamp");
            int A016 = AbstractC37601ox.A01(query, "impression_count");
            int A017 = AbstractC37601ox.A01(query, "priority_section_eligibility");
            int A018 = AbstractC37601ox.A01(query, "major_app_version");
            int A019 = AbstractC37601ox.A01(query, "data");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(A01);
                String string2 = query.getString(A012);
                int i2 = query.getInt(A013);
                long j3 = query.getLong(A014);
                if (query.isNull(A015)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(A015));
                }
                int i3 = query.getInt(A016);
                boolean z = false;
                if (query.getInt(A017) != 0) {
                    z = true;
                }
                arrayList.add(new C109504wc(valueOf, string, string2, query.getBlob(A019), i2, i3, query.getInt(A018), j3, z));
            }
            return arrayList;
        } finally {
            query.close();
            A00.A00();
        }
    }

    public final void A02(List list) {
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            this.A05.insert((Iterable) list);
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
        }
    }

    public C109424wU(final C1YP c1yp) {
        this.A00 = c1yp;
        this.A05 = new AbstractC29571bY(c1yp) { // from class: X.4wV
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `newfeedstory` (`id`,`user_id`,`notification_type`,`timestamp`,`first_impression_timestamp`,`impression_count`,`priority_section_eligibility`,`major_app_version`,`data`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C109504wc c109504wc = (C109504wc) obj;
                interfaceC37561ot.ADp(1, c109504wc.A05);
                interfaceC37561ot.ADp(2, c109504wc.A06);
                interfaceC37561ot.ADi(3, c109504wc.A02);
                interfaceC37561ot.ADi(4, c109504wc.A03);
                Long l = c109504wc.A04;
                if (l == null) {
                    interfaceC37561ot.ADj(5);
                } else {
                    interfaceC37561ot.ADi(5, l.longValue());
                }
                interfaceC37561ot.ADi(6, c109504wc.A00);
                interfaceC37561ot.ADi(7, c109504wc.A07 ? 1L : 0L);
                interfaceC37561ot.ADi(8, c109504wc.A01);
                interfaceC37561ot.ADc(9, c109504wc.A08);
            }
        };
        this.A04 = new AbstractC49502Ph(c1yp) { // from class: X.4wW
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "UPDATE OR ABORT `newfeedstory` SET `id` = ?,`user_id` = ?,`notification_type` = ?,`timestamp` = ?,`first_impression_timestamp` = ?,`impression_count` = ?,`priority_section_eligibility` = ?,`major_app_version` = ?,`data` = ? WHERE `id` = ?";
            }

            @Override // X.AbstractC49502Ph
            public final /* bridge */ /* synthetic */ void A01(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C109504wc c109504wc = (C109504wc) obj;
                String str = c109504wc.A05;
                interfaceC37561ot.ADp(1, str);
                interfaceC37561ot.ADp(2, c109504wc.A06);
                interfaceC37561ot.ADi(3, c109504wc.A02);
                interfaceC37561ot.ADi(4, c109504wc.A03);
                Long l = c109504wc.A04;
                if (l == null) {
                    interfaceC37561ot.ADj(5);
                } else {
                    interfaceC37561ot.ADi(5, l.longValue());
                }
                interfaceC37561ot.ADi(6, c109504wc.A00);
                interfaceC37561ot.ADi(7, c109504wc.A07 ? 1L : 0L);
                interfaceC37561ot.ADi(8, c109504wc.A01);
                interfaceC37561ot.ADc(9, c109504wc.A08);
                interfaceC37561ot.ADp(10, str);
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.4wX
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n    DELETE FROM newfeedstory\n    WHERE id = ?\n  ";
            }
        };
        this.A01 = new AbstractC29601bb(c1yp) { // from class: X.4wY
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n    DELETE FROM newfeedstory WHERE user_id = ?\n  ";
            }
        };
        this.A03 = new AbstractC29601bb(c1yp) { // from class: X.4wZ
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n    UPDATE newfeedstory SET \n      impression_count = impression_count + 1,\n      first_impression_timestamp = COALESCE(first_impression_timestamp, CURRENT_TIMESTAMP),\n      priority_section_eligibility = 0\n    WHERE id = ?\n    ";
            }
        };
    }
}
