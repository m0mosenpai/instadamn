package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Vt6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69665Vt6 {
    public ImageUrl A00;
    public C69173Vj2 A01;
    public C69173Vj2 A02;
    public C69173Vj2 A03;
    public ILV A04;
    public ILV A05;
    public ILV A06;
    public C69251VkK A07;
    public VDZ A08;
    public Boolean A09;
    public String A0A;
    public HashMap A0B;
    public List A0C;
    public List A0D;
    public List A0E;
    public final ILV A0F;
    public final ILV A0G;
    public final String A0H;

    public final String A00() {
        HashMap hashMap = this.A0B;
        if (hashMap != null) {
            return (String) hashMap.get("selected_tags");
        }
        return null;
    }

    public C69665Vt6(ILV ilv, ILV ilv2, String str) {
        AbstractC167017dG.A1P(str, ilv);
        this.A0H = str;
        this.A0G = ilv;
        this.A0F = ilv2;
    }
}
