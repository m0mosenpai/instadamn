package X;

import android.graphics.Color;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.W6i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70134W6i {
    public static final int A00(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        if (!AbstractC002300n.A0h(str, "#", false)) {
            str = AnonymousClass001.A0D(str, '#');
        }
        return Color.parseColor(str);
    }

    public static final ImageInfo A01(C68767Vbk c68767Vbk) {
        C69118Vi8 c69118Vi8;
        String str;
        if (c68767Vbk == null || (str = (c69118Vi8 = (C69118Vi8) AbstractC166987dD.A16(c68767Vbk.A00)).A02) == null) {
            return null;
        }
        return AbstractC40161tk.A05(new ImageInfoImpl(null, null, null, null, null), AbstractC166987dD.A1J(new ExtendedImageUrl(str, c69118Vi8.A01, c69118Vi8.A00)));
    }

    public static final ArrayList A02(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && (!list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C69230Vjy c69230Vjy = (C69230Vjy) it.next();
                arrayList.add(new AndroidLinkImpl(null, null, null, null, null, null, Integer.valueOf(c69230Vjy.A00), null, null, null, null, null, null, null, c69230Vjy.A02, null, null, null, null, c69230Vjy.A01, null, null, null, null, null, null, c69230Vjy.A03));
            }
        }
        return arrayList;
    }
}
