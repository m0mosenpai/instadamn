package X;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8KU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KU {
    public List A00;
    public boolean A01;
    public final Context A02;
    public final C8KT A03;
    public final C85O A04;
    public final C85N A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    public final List A00() {
        ?? arrayList;
        List list = this.A00;
        List list2 = list;
        if (list == null) {
            if (this.A01) {
                arrayList = AbstractC62307S6c.A00;
            } else {
                Context context = this.A02;
                File file = new File(context.getFilesDir(), "concept_list_local_v1.classes");
                if (!file.exists()) {
                    try {
                        InputStream open = context.getAssets().open("concept_list.classes");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = open.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                    } catch (IOException e) {
                        this.A03.EmU("SceneUnderstandingResourceLoader", "Load concept list failed.", e);
                    }
                }
                String path = file.getPath();
                C14360o3.A07(path);
                arrayList = new ArrayList();
                try {
                    Iterator it = new C2Z2(new C51742Yx(new BufferedReader(new FileReader(new File(path))))).iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                } catch (IOException e2) {
                    this.A03.EmU("SceneUnderstandingResourceLoader", "Read concept list failed.", e2);
                }
            }
            this.A00 = arrayList;
            list2 = arrayList;
        }
        if (list2 == null) {
            C14360o3.A0F("concepts");
            throw C00O.createAndThrow();
        }
        return list2;
    }

    public C8KU(Context context, C8KT c8kt, C85N c85n) {
        this.A02 = context;
        this.A05 = c85n;
        this.A03 = c8kt;
        this.A04 = new C85O(c85n, "scene_understanding");
    }
}
