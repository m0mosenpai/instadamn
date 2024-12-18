package com.instagram.model.effect;

import X.AnonymousClass001;
import X.C0w9;
import X.C120425cl;
import X.InterfaceC38391qT;
import android.os.Parcelable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class AREffect implements InterfaceC38391qT, Parcelable {
    public ImageUrl A01() {
        return ((CameraAREffect) this).A07;
    }

    public String A02() {
        return ((CameraAREffect) this).A0B;
    }

    public String A03() {
        return ((CameraAREffect) this).A0C;
    }

    public String A04() {
        return ((CameraAREffect) this).A0F;
    }

    public String A05() {
        return ((CameraAREffect) this).A0S;
    }

    public String A06() {
        return ((CameraAREffect) this).A0M;
    }

    public String A07() {
        return ((CameraAREffect) this).A0R;
    }

    public List A08() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CameraAREffect) this).A0Z.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((C120425cl) it.next()).A01);
        }
        return arrayList;
    }

    public List A09() {
        return ((CameraAREffect) this).A0T;
    }

    public List A0A() {
        return ((CameraAREffect) this).A0V;
    }

    public List A0B() {
        return ((CameraAREffect) this).A0W;
    }

    public boolean A0C() {
        return ((CameraAREffect) this).A0d;
    }

    public String getId() {
        return ((CameraAREffect) this).A0K;
    }

    public final boolean A0D() {
        if (A02() != null && A03() != null) {
            return true;
        }
        C0w9.A03("AREffect", AnonymousClass001.A0R("At least one of the attribution_id and attribution_username is null in the effect: ", getId()));
        return false;
    }
}
