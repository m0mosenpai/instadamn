package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* renamed from: X.92u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043892u {
    public final C1YP A00;

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0108, code lost:
    
        if (r2 == r5) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1JX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A00(X.C2043892u r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2043892u.A00(X.92u, X.1Ds):java.lang.Object");
    }

    public final Object A01(String str, InterfaceC23621Ds interfaceC23621Ds) {
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00("\n        SELECT *\n        FROM content_filter_dictionary_metadata\n        WHERE dictionary_key = ?\n      ", 1);
        A00.ADp(1, str);
        return C2Q9.A00(new CancellationSignal(), this.A00, new Callable() { // from class: X.91c
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C1YP c1yp = this.A00;
                C37581ov c37581ov = A00;
                Cursor A002 = C3EP.A00(c1yp, c37581ov, false);
                try {
                    int A01 = AbstractC37601ox.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    int A012 = AbstractC37601ox.A01(A002, "dictionary_key");
                    int A013 = AbstractC37601ox.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    int A014 = AbstractC37601ox.A01(A002, "language");
                    int A015 = AbstractC37601ox.A01(A002, "editable");
                    int A016 = AbstractC37601ox.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    int A017 = AbstractC37601ox.A01(A002, "strategy_id");
                    int A018 = AbstractC37601ox.A01(A002, "loadedVersion");
                    int A019 = AbstractC37601ox.A01(A002, "latestVersion");
                    int A0110 = AbstractC37601ox.A01(A002, "supportsVersioning");
                    ArrayList arrayList = new ArrayList(A002.getCount());
                    while (A002.moveToNext()) {
                        long j = A002.getLong(A01);
                        String string = A002.getString(A012);
                        String string2 = A002.getString(A013);
                        String string3 = A002.getString(A014);
                        boolean z = false;
                        if (A002.getInt(A015) != 0) {
                            z = true;
                        }
                        int i = A002.getInt(A016);
                        int i2 = A002.getInt(A017);
                        String string4 = A002.getString(A018);
                        String string5 = A002.getString(A019);
                        boolean z2 = false;
                        if (A002.getInt(A0110) != 0) {
                            z2 = true;
                        }
                        arrayList.add(new C129365sy(string, string2, string3, string4, string5, i, i2, j, z, z2));
                    }
                    return arrayList;
                } finally {
                    A002.close();
                    c37581ov.A00();
                }
            }
        }, interfaceC23621Ds, false);
    }

    public final Object A02(List list, InterfaceC23621Ds interfaceC23621Ds) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("        SELECT id, dictionary_key");
        sb.append("\n");
        sb.append("        FROM content_filter_dictionary_metadata");
        sb.append("\n");
        sb.append("        WHERE dictionary_key IN (");
        int size = list.size();
        AbstractC73723Sa.A00(sb, size);
        sb.append(")");
        sb.append("\n");
        sb.append("      ");
        String obj = sb.toString();
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00(obj, size);
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            A00.ADp(i, (String) it.next());
            i++;
        }
        return C2Q9.A00(new CancellationSignal(), this.A00, new Callable() { // from class: X.5jG
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                C1YP c1yp = this.A00;
                C37581ov c37581ov = A00;
                Cursor A002 = C3EP.A00(c1yp, c37581ov, false);
                try {
                    ArrayList arrayList = new ArrayList(A002.getCount());
                    while (A002.moveToNext()) {
                        arrayList.add(new C206349Br(A002.getLong(0), A002.getString(1)));
                    }
                    return arrayList;
                } finally {
                    A002.close();
                    c37581ov.A00();
                }
            }
        }, interfaceC23621Ds, false);
    }

    public C2043892u(C1YP c1yp) {
        this.A00 = c1yp;
    }

    public C2043892u() {
    }
}
