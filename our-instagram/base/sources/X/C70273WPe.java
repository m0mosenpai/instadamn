package X;

import com.google.common.collect.ImmutableList;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

/* renamed from: X.WPe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70273WPe implements C1N8 {
    public final /* synthetic */ Was A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public C70273WPe(Was was, String str, String str2, String str3, List list) {
        this.A00 = was;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = list;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C62731SNv c62731SNv = (C62731SNv) obj;
        this.A00.A00.getValue();
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        List list = this.A04;
        try {
            WWD wwd = (WWD) AbstractC25234BEr.A0d(C69819Vw5.class);
            C2JM c2jm = wwd.A00;
            c2jm.A04("interface_type", "IG_ANDROID");
            wwd.A02 = true;
            c2jm.A04("fe_id", str);
            c2jm.A04(AbstractC63083Sc6.A00(), str2);
            c2jm.A04("view_name", str3);
            c2jm.A05("subtypes_to_filter", ImmutableList.copyOf((Collection) list));
            C1Dk A00 = wwd.A00();
            C14360o3.A07(A00);
            return C60622REh.A00(c62731SNv, C2FP.A06().A00.A01, A00, C70553Wcj.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
