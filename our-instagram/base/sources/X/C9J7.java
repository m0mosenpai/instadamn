package X;

import android.graphics.Rect;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Comparator;

/* renamed from: X.9J7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9J7 implements Comparator {
    public final int A00;

    public C9J7(int i) {
        this.A00 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int centerY;
        int centerY2;
        Comparable comparable;
        Comparable comparable2;
        switch (this.A00) {
            case 0:
                comparable = (Float) ((C09530e4) obj2).A01;
                comparable2 = (Float) ((C09530e4) obj).A01;
                return C2BS.A00(comparable, comparable2);
            case 1:
                comparable = Float.valueOf(((C23011ACl) obj2).A00);
                comparable2 = Float.valueOf(((C23011ACl) obj).A00);
                return C2BS.A00(comparable, comparable2);
            case 2:
                comparable = Integer.valueOf(((C23011ACl) obj).A01);
                comparable2 = Integer.valueOf(((C23011ACl) obj2).A01);
                return C2BS.A00(comparable, comparable2);
            case 3:
                centerY = ((EnumC222969sb) obj).A00;
                centerY2 = ((EnumC222969sb) obj2).A00;
                break;
            case 4:
                C9J0 c9j0 = (C9J0) obj;
                long j = c9j0.A01;
                if (-1 == j) {
                    j = c9j0.A02;
                }
                comparable = Long.valueOf(j);
                C9J0 c9j02 = (C9J0) obj2;
                long j2 = c9j02.A01;
                if (-1 == j2) {
                    j2 = c9j02.A02;
                }
                comparable2 = Long.valueOf(j2);
                return C2BS.A00(comparable, comparable2);
            case 5:
            case 8:
                comparable = Long.valueOf(((C9J0) obj2).A02);
                comparable2 = Long.valueOf(((C9J0) obj).A02);
                return C2BS.A00(comparable, comparable2);
            case 6:
                comparable = Integer.valueOf(((BE5) ((C51760Mtj) obj).A02).getZIndex());
                comparable2 = Integer.valueOf(((BE5) ((C51760Mtj) obj2).A02).getZIndex());
                return C2BS.A00(comparable, comparable2);
            case 7:
                comparable = ((RemoteMedia) obj2).A05;
                comparable2 = ((RemoteMedia) obj).A05;
                return C2BS.A00(comparable, comparable2);
            case 9:
            case 10:
            case 11:
            default:
                comparable = Integer.valueOf(((C51753Mtc) obj).A01);
                comparable2 = Integer.valueOf(((C51753Mtc) obj2).A01);
                return C2BS.A00(comparable, comparable2);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                centerY = ((Rect) obj2).centerY();
                centerY2 = ((Rect) obj).centerY();
                break;
        }
        return centerY - centerY2;
    }
}
