package X;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.VvT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69788VvT {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public VDT A04;
    public File A05;
    public String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C69788VvT c69788VvT = (C69788VvT) obj;
            if (this.A02 != c69788VvT.A02 || this.A03 != c69788VvT.A03 || !C14360o3.A0K(this.A05.getPath(), c69788VvT.A05.getPath()) || this.A04 != c69788VvT.A04 || !C14360o3.A0K(this.A06, c69788VvT.A06) || this.A00 != c69788VvT.A00 || this.A01 != c69788VvT.A01) {
                return false;
            }
        }
        return true;
    }

    public C69788VvT(JSONObject jSONObject) {
        VDT vdt;
        VCK vck = new VCK(jSONObject.getString("filePath"), false);
        String string = jSONObject.getString("mFileSize");
        C14360o3.A07(string);
        long parseLong = Long.parseLong(string);
        String string2 = jSONObject.getString("mSegmentType");
        C14360o3.A07(string2);
        int parseInt = Integer.parseInt(string2);
        if (parseInt != 1) {
            if (parseInt != 2) {
                vdt = VDT.A04;
            } else {
                vdt = VDT.A05;
            }
        } else {
            vdt = VDT.A03;
        }
        String string3 = jSONObject.getString("mMimeType");
        C14360o3.A07(string3);
        String string4 = jSONObject.getString("mSegmentStartOffset");
        C14360o3.A07(string4);
        long parseLong2 = Long.parseLong(string4);
        String string5 = jSONObject.getString("mSegmentId");
        C14360o3.A07(string5);
        int parseInt2 = Integer.parseInt(string5);
        String string6 = jSONObject.getString("mEstimatedFileSize");
        C14360o3.A07(string6);
        long parseLong3 = Long.parseLong(string6);
        this.A05 = vck;
        this.A02 = parseLong;
        this.A04 = vdt;
        this.A06 = string3;
        this.A03 = parseLong2;
        this.A00 = parseInt2;
        this.A01 = parseLong3;
    }

    public final JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filePath", this.A05.getPath());
        jSONObject.put("mFileSize", this.A02);
        jSONObject.put("mSegmentType", this.A04.A00);
        jSONObject.put("mMimeType", this.A06);
        jSONObject.put("mSegmentStartOffset", this.A03);
        jSONObject.put("mSegmentId", this.A00);
        jSONObject.put("mEstimatedFileSize", this.A01);
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, Long.valueOf(this.A02), this.A04, this.A06, Long.valueOf(this.A03), Integer.valueOf(this.A00), Long.valueOf(this.A01)});
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("mSegmentType", this.A04.name());
        String path = this.A05.getPath();
        C14360o3.A07(path);
        hashMap.put("filePath", path);
        hashMap.put("mFileSize", String.valueOf(this.A02));
        hashMap.put("mMimeType", this.A06);
        hashMap.put("mSegmentStartOffset", String.valueOf(this.A03));
        hashMap.put("mSegmentId", String.valueOf(this.A00));
        hashMap.put("mEstimatedFileSize", String.valueOf(this.A01));
        return hashMap.toString();
    }
}
