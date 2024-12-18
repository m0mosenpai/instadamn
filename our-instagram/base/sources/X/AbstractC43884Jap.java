package X;

/* renamed from: X.Jap, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43884Jap {
    public static final com.instagram.creation.base.ui.mediatabbar.Tab A00 = new com.instagram.creation.base.ui.mediatabbar.Tab(2131963125, 0);
    public static final com.instagram.creation.base.ui.mediatabbar.Tab A01 = new com.instagram.creation.base.ui.mediatabbar.Tab(2131969575, 1);
    public static final com.instagram.creation.base.ui.mediatabbar.Tab A02 = new com.instagram.creation.base.ui.mediatabbar.Tab(2131976620, 2);

    public static final com.instagram.creation.base.ui.mediatabbar.Tab A00(int i) {
        com.instagram.creation.base.ui.mediatabbar.Tab tab = A00;
        if (i != 0) {
            tab = A01;
            if (i != 1) {
                tab = A02;
                if (i != 2) {
                    throw AbstractC25230BEn.A0n("No tab which matches index ", i);
                }
            }
        }
        return tab;
    }
}
