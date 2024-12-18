package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* renamed from: X.4tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C108074tq implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C29461bN A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ List A05;

    public /* synthetic */ C108074tq(UserSession userSession, C29461bN c29461bN, Long l, List list, int i, long j) {
        this.A03 = c29461bN;
        this.A00 = i;
        this.A01 = j;
        this.A04 = l;
        this.A05 = list;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        CancellationSignal cancellationSignal;
        C1YP c1yp;
        Callable callable;
        final C29461bN c29461bN = this.A03;
        int i = this.A00;
        long j = this.A01;
        Long l = this.A04;
        List list = this.A05;
        UserSession userSession = this.A02;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj;
        if (l != null) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36328426822778381L);
            long longValue = l.longValue();
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append("    SELECT *");
            sb.append("\n");
            sb.append("    FROM user_feed_items");
            sb.append("\n");
            sb.append("    WHERE stored_age > ");
            sb.append("?");
            sb.append("\n");
            sb.append("      AND media_age > ");
            sb.append("?");
            sb.append("\n");
            sb.append("      AND item_type IN (");
            int size = list.size();
            AbstractC73723Sa.A00(sb, size);
            sb.append(")");
            if (A06) {
                sb.append("\n");
                sb.append("    LIMIT ");
                sb.append("?");
                sb.append("\n");
                sb.append("  ");
                String obj2 = sb.toString();
                int i2 = 3;
                int i3 = size + 3;
                TreeMap treeMap = C37581ov.A08;
                C37581ov A00 = AbstractC37591ow.A00(obj2, i3);
                A00.ADi(1, j);
                A00.ADi(2, longValue);
                for (Object obj3 : list) {
                    C14360o3.A0B(obj3, 0);
                    A00.ADp(i2, obj3.toString());
                    i2++;
                }
                A00.ADi(i3, i);
                cancellationSignal = new CancellationSignal();
                c1yp = c29461bN.A01;
                callable = new CallableC50058M7w(A00, c29461bN);
            } else {
                sb.append("\n");
                sb.append("    ORDER BY ranking_weight");
                sb.append("\n");
                sb.append("    DESC LIMIT ");
                sb.append("?");
                sb.append("\n");
                sb.append("  ");
                String obj4 = sb.toString();
                int i4 = 3;
                int i5 = size + 3;
                TreeMap treeMap2 = C37581ov.A08;
                final C37581ov A002 = AbstractC37591ow.A00(obj4, i5);
                A002.ADi(1, j);
                A002.ADi(2, longValue);
                for (Object obj5 : list) {
                    C14360o3.A0B(obj5, 0);
                    A002.ADp(i4, obj5.toString());
                    i4++;
                }
                A002.ADi(i5, i);
                cancellationSignal = new CancellationSignal();
                c1yp = c29461bN.A01;
                callable = new Callable() { // from class: X.4tr
                    @Override // java.util.concurrent.Callable
                    public final /* bridge */ /* synthetic */ Object call() {
                        Float valueOf;
                        Long valueOf2;
                        C1YP c1yp2 = c29461bN.A01;
                        C37581ov c37581ov = A002;
                        Cursor A003 = C3EP.A00(c1yp2, c37581ov, false);
                        try {
                            int A01 = AbstractC37601ox.A01(A003, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            int A012 = AbstractC37601ox.A01(A003, "ranking_weight");
                            int A013 = AbstractC37601ox.A01(A003, "data");
                            int A014 = AbstractC37601ox.A01(A003, "media_age");
                            int A015 = AbstractC37601ox.A01(A003, "stored_age");
                            int A016 = AbstractC37601ox.A01(A003, "item_type");
                            ArrayList arrayList = new ArrayList(A003.getCount());
                            while (A003.moveToNext()) {
                                String string = A003.getString(A01);
                                if (A003.isNull(A012)) {
                                    valueOf = null;
                                } else {
                                    valueOf = Float.valueOf(A003.getFloat(A012));
                                }
                                byte[] blob = A003.getBlob(A013);
                                if (A003.isNull(A014)) {
                                    valueOf2 = null;
                                } else {
                                    valueOf2 = Long.valueOf(A003.getLong(A014));
                                }
                                arrayList.add(new C108104tt(AbstractC108094ts.A00(A003.getString(A016)), valueOf, valueOf2, string, blob, A003.getLong(A015)));
                            }
                            return arrayList;
                        } finally {
                            A003.close();
                            c37581ov.A00();
                        }
                    }
                };
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\n");
            sb2.append("    SELECT *");
            sb2.append("\n");
            sb2.append("    FROM user_feed_items");
            sb2.append("\n");
            sb2.append("    WHERE stored_age > ");
            sb2.append("?");
            sb2.append("\n");
            sb2.append("    AND item_type IN (");
            int size2 = list.size();
            AbstractC73723Sa.A00(sb2, size2);
            sb2.append(")");
            sb2.append("\n");
            sb2.append("LIMIT ");
            sb2.append("?");
            sb2.append("\n");
            sb2.append("  ");
            String obj6 = sb2.toString();
            int i6 = 2;
            int i7 = size2 + 2;
            TreeMap treeMap3 = C37581ov.A08;
            final C37581ov A003 = AbstractC37591ow.A00(obj6, i7);
            A003.ADi(1, j);
            for (Object obj7 : list) {
                C14360o3.A0B(obj7, 0);
                A003.ADp(i6, obj7.toString());
                i6++;
            }
            A003.ADi(i7, i);
            cancellationSignal = new CancellationSignal();
            c1yp = c29461bN.A01;
            callable = new Callable() { // from class: X.50S
                @Override // java.util.concurrent.Callable
                public final /* bridge */ /* synthetic */ Object call() {
                    Float valueOf;
                    Long valueOf2;
                    C1YP c1yp2 = c29461bN.A01;
                    C37581ov c37581ov = A003;
                    Cursor A004 = C3EP.A00(c1yp2, c37581ov, false);
                    try {
                        int A01 = AbstractC37601ox.A01(A004, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        int A012 = AbstractC37601ox.A01(A004, "ranking_weight");
                        int A013 = AbstractC37601ox.A01(A004, "data");
                        int A014 = AbstractC37601ox.A01(A004, "media_age");
                        int A015 = AbstractC37601ox.A01(A004, "stored_age");
                        int A016 = AbstractC37601ox.A01(A004, "item_type");
                        ArrayList arrayList = new ArrayList(A004.getCount());
                        while (A004.moveToNext()) {
                            String string = A004.getString(A01);
                            if (A004.isNull(A012)) {
                                valueOf = null;
                            } else {
                                valueOf = Float.valueOf(A004.getFloat(A012));
                            }
                            byte[] blob = A004.getBlob(A013);
                            if (A004.isNull(A014)) {
                                valueOf2 = null;
                            } else {
                                valueOf2 = Long.valueOf(A004.getLong(A014));
                            }
                            arrayList.add(new C108104tt(AbstractC108094ts.A00(A004.getString(A016)), valueOf, valueOf2, string, blob, A004.getLong(A015)));
                        }
                        return arrayList;
                    } finally {
                        A004.close();
                        c37581ov.A00();
                    }
                }
            };
        }
        return C2Q9.A00(cancellationSignal, c1yp, callable, interfaceC23621Ds, false);
    }
}
