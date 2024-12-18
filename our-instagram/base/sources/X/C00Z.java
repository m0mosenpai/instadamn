package X;

import com.facebook.common.dextricks.Constants;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.00Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00Z extends AbstractC09260db {
    public C001500d[] A00;
    public final AbstractC07480aN A01;
    public final ZipFile A02;
    public final /* synthetic */ C0QB A03;

    public C00Z(C0QB c0qb, AbstractC07480aN abstractC07480aN) {
        this.A03 = c0qb;
        this.A02 = new ZipFile(c0qb.A00);
        this.A01 = abstractC07480aN;
    }

    @Override // X.AbstractC09260db
    public final void A01(File file) {
        C001500d[] c001500dArr = this.A00;
        if (c001500dArr == null) {
            c001500dArr = A03();
            this.A00 = c001500dArr;
        }
        byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
        for (C001500d c001500d : c001500dArr) {
            InputStream inputStream = this.A02.getInputStream(c001500d.A01);
            try {
                AbstractC09260db.A00(c001500d, file, inputStream, bArr);
                inputStream.close();
            } finally {
            }
        }
    }

    @Override // X.AbstractC09260db
    public final C09240dZ[] A02() {
        C001500d[] c001500dArr = this.A00;
        if (c001500dArr == null) {
            C001500d[] A03 = A03();
            this.A00 = A03;
            return A03;
        }
        return c001500dArr;
    }

    public final C001500d[] A03() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        Pattern compile = Pattern.compile(this.A03.A01);
        String[] A01 = AbstractC09190dU.A01();
        Enumeration<? extends ZipEntry> entries = this.A02.entries();
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            Matcher matcher = compile.matcher(nextElement.getName());
            if (matcher.matches()) {
                int groupCount = matcher.groupCount();
                String group = matcher.group(groupCount - 1);
                String group2 = matcher.group(groupCount);
                int i = 0;
                while (true) {
                    if (i >= A01.length) {
                        break;
                    }
                    String str = A01[i];
                    if (str != null && group.equals(str)) {
                        if (i >= 0) {
                            linkedHashSet.add(group);
                            C001500d c001500d = (C001500d) hashMap.get(group2);
                            if (c001500d == null || i < c001500d.A00) {
                                hashMap.put(group2, new C001500d(group2, nextElement, i));
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        this.A01.A00 = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
        C001500d[] c001500dArr = (C001500d[]) hashMap.values().toArray(new C001500d[hashMap.size()]);
        Arrays.sort(c001500dArr);
        return c001500dArr;
    }

    @Override // X.AbstractC09260db, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A02.close();
    }
}
