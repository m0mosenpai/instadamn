package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.OvZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56114OvZ implements InterfaceC66482zP {
    public final SpannableStringBuilder A00;
    public final ImageUrl A01;
    public final OCS A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public C56114OvZ(SpannableStringBuilder spannableStringBuilder, ImageUrl imageUrl, OCS ocs, Integer num, String str, String str2, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A00 = spannableStringBuilder;
        this.A01 = imageUrl;
        this.A02 = ocs;
        this.A04 = str3;
        this.A03 = num;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
