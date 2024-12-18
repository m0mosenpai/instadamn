package X;

import android.os.LocaleList;
import java.util.ArrayList;

/* renamed from: X.5gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122545gp {
    public static final InterfaceC122565gr A00 = new InterfaceC122565gr() { // from class: X.5gq
        public LocaleList A00;
        public C114095Cv A01;
        public final C5DG A02 = new Object();

        @Override // X.InterfaceC122565gr
        public final C114095Cv Au7() {
            C114095Cv c114095Cv;
            LocaleList localeList = LocaleList.getDefault();
            synchronized (this.A02) {
                c114095Cv = this.A01;
                if (c114095Cv == null || localeList != this.A00) {
                    int size = localeList.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList.add(new C122575gs(localeList.get(i)));
                    }
                    c114095Cv = new C114095Cv(arrayList);
                    this.A00 = localeList;
                    this.A01 = c114095Cv;
                }
            }
            return c114095Cv;
        }
    };
}
