package X;

import android.content.Context;
import com.facebook.forker.Process;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.8Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C189058Yv {
    public InterfaceC189068Yw A00;
    public Folder A01;
    public Runnable A02;
    public Map A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C189088Yy A07;
    public final UserSession A08;
    public final C189028Ys A09;
    public final Map A0A;
    public final C05A A0B;
    public final boolean A0C;
    public final C2AH A0D;

    public final void A0B(Medium medium) {
        C14360o3.A0B(medium, 0);
        InterfaceC189068Yw interfaceC189068Yw = this.A00;
        if (interfaceC189068Yw != null) {
            interfaceC189068Yw.EdU(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)), true, false);
        }
    }

    public C189058Yv(Context context, C2AH c2ah, InterfaceC189068Yw interfaceC189068Yw, C189028Ys c189028Ys) {
        this.A09 = c189028Ys;
        this.A00 = interfaceC189068Yw;
        this.A06 = context;
        this.A0D = c2ah;
        UserSession userSession = c189028Ys.A0A;
        this.A08 = userSession;
        AbstractC018607g abstractC018607g = c189028Ys.A05;
        EnumC188968Ym enumC188968Ym = c189028Ys.A08;
        int i = c189028Ys.A01;
        int i2 = c189028Ys.A02;
        boolean z = c189028Ys.A0G;
        boolean z2 = c189028Ys.A0F;
        C189088Yy c189088Yy = new C189088Yy(context, abstractC018607g, c189028Ys.A07, enumC188968Ym, userSession, new C189078Yx(c2ah, this), i, i2, c189028Ys.A04, c189028Ys.A03, z, z2, c189028Ys.A0J);
        this.A07 = c189088Yy;
        this.A0C = c189028Ys.A0E;
        C188998Yp c188998Yp = c189028Ys.A0B;
        if (c188998Yp != null) {
            c189088Yy.A03 = c188998Yp;
        }
        LinkedHashMap A00 = A00(this);
        this.A0A = A00;
        C14360o3.A0B(A00, 0);
        this.A03 = A00;
        A03(this);
        Folder folder = (Folder) this.A03.get(Integer.valueOf(c189028Ys.A00));
        if (folder == null) {
            Object obj = A00.get(-1);
            if (obj != null) {
                folder = (Folder) obj;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A01 = folder;
        this.A0B = new C008002u(folder);
    }

    public static final LinkedHashMap A00(C189058Yv c189058Yv) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Context context = c189058Yv.A06;
        String string = context.getString(2131962674);
        C14360o3.A07(string);
        linkedHashMap.put(-1, new Folder(string, null, -1, false));
        String string2 = context.getString(2131962673);
        C14360o3.A07(string2);
        linkedHashMap.put(-2, new Folder(string2, null, -2, false));
        String string3 = context.getString(2131962675);
        C14360o3.A07(string3);
        linkedHashMap.put(-3, new Folder(string3, null, -3, false));
        String string4 = context.getString(2131962672);
        C14360o3.A07(string4);
        linkedHashMap.put(-5, new Folder(string4, null, -5, false));
        String string5 = context.getString(2131962669);
        C14360o3.A07(string5);
        linkedHashMap.put(-9, new Folder(string5, null, -9, false));
        String string6 = context.getString(2131962671);
        C14360o3.A07(string6);
        linkedHashMap.put(-10, new Folder(string6, null, -10, false));
        linkedHashMap.put(-6, new Folder("Instagram", null, -6, false));
        linkedHashMap.put(-7, new Folder("Boomerang", null, -7, false));
        linkedHashMap.put(-8, new Folder("Layout", null, -8, false));
        return linkedHashMap;
    }

    public static final void A01(Medium medium, Folder folder) {
        folder.A00++;
        C14360o3.A0B(medium, 0);
        folder.A05.add(medium);
        folder.A06.add(Integer.valueOf(medium.A05));
        folder.A01 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.common.gallery.Medium r9, X.C189058Yv r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189058Yv.A02(com.instagram.common.gallery.Medium, X.8Yv, java.util.Map):void");
    }

    public static final void A03(C189058Yv c189058Yv) {
        for (Folder folder : c189058Yv.A0A.values()) {
            folder.A05.clear();
            folder.A06.clear();
            folder.A01 = null;
            folder.A00 = 0;
        }
    }

    public final ArrayList A04() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A03.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Object value = entry.getValue();
            switch (intValue) {
                case -10:
                case -9:
                case -8:
                case -7:
                case -6:
                case Process.SD_STDOUT /* -5 */:
                case Process.SD_BLACK_HOLE /* -3 */:
                case -2:
                case -1:
                    arrayList.add(value);
                    break;
            }
        }
        return arrayList;
    }

    public final ArrayList A05() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.A03.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Folder folder = (Folder) entry.getValue();
            if (!folder.A05.isEmpty() && intValue != -1 && intValue != -2 && intValue != -3 && intValue != -5 && intValue != -9 && intValue != -6 && intValue != -7 && intValue != -8 && intValue != -10) {
                arrayList.add(folder);
            }
        }
        return arrayList;
    }

    public final List A06() {
        Object obj = this.A0A.get(-1);
        if (obj != null) {
            return ((Folder) obj).A01();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A07() {
        A0A(this.A09.A01);
    }

    public final void A08() {
        ((C18240vB) C189088Yy.A0K.getValue()).ATO(new C180387zS(this.A07));
        this.A09.A09.AHe();
    }

    public final void A09() {
        C189088Yy c189088Yy = this.A07;
        if (c189088Yy.A0A) {
            ((C18240vB) C189088Yy.A0K.getValue()).ATO(new C8Z7(c189088Yy));
        }
    }

    public final void A0A(int i) {
        C189088Yy c189088Yy = this.A07;
        c189088Yy.A01 = i;
        c189088Yy.A01(new C189078Yx(this.A0D, this));
    }

    public final boolean A0C(int i) {
        Map map = this.A03;
        Integer valueOf = Integer.valueOf(i);
        Folder folder = (Folder) map.get(valueOf);
        if (folder == null && ((folder = (Folder) this.A0A.get(valueOf)) == null || !folder.A07)) {
            folder = (Folder) this.A03.get(Integer.valueOf(this.A09.A00));
        }
        if (folder == null || (C14360o3.A0K(this.A01, folder) && !this.A05)) {
            return false;
        }
        this.A05 = false;
        this.A01 = folder;
        this.A0B.Egh(folder);
        InterfaceC189068Yw interfaceC189068Yw = this.A00;
        if (interfaceC189068Yw != null) {
            List A01 = this.A01.A01();
            String str = this.A01.A03;
            if (str == null) {
                str = "";
            }
            interfaceC189068Yw.EYj(A01, str);
            return true;
        }
        return true;
    }
}
