package X;

import android.os.Parcelable;
import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.List;

/* renamed from: X.NPk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52615NPk extends AbstractC56115Ova {
    public Parcelable A00;
    public List A01;
    public boolean A02;
    public boolean A03;

    public final void A00(boolean z) {
        C51849Mvr c51849Mvr;
        C51850Mvs c51850Mvs = super.A01;
        List list = c51850Mvs.A05;
        String str = c51850Mvs.A02;
        String str2 = c51850Mvs.A03;
        List list2 = c51850Mvs.A06;
        String str3 = c51850Mvs.A04;
        MediaKitSectionType mediaKitSectionType = c51850Mvs.A01;
        C51849Mvr c51849Mvr2 = c51850Mvs.A00;
        if (c51849Mvr2 != null) {
            List list3 = c51849Mvr2.A00;
            AbstractC167017dG.A0x();
            c51849Mvr = Nv8.A00(list3, z);
        } else {
            c51849Mvr = null;
        }
        super.A01 = Nv9.A00(c51849Mvr, mediaKitSectionType, str, str2, str3, list, list2);
        this.A03 = z;
    }
}
