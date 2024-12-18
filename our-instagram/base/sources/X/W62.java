package X;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class W62 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final VDT A04;
    public final File A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            W62 w62 = (W62) obj;
            long j = this.A02;
            long j2 = w62.A02;
            if ((j != -1 && j2 != -1 && j != j2) || this.A03 != w62.A03 || !C14360o3.A0K(this.A05.getPath(), w62.A05.getPath()) || this.A04 != w62.A04 || this.A00 != w62.A00 || !C14360o3.A0K(this.A06, w62.A06) || this.A01 != w62.A01) {
                return false;
            }
        }
        return true;
    }

    public final JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filePath", this.A05.getPath());
        jSONObject.put("mFileSize", this.A02);
        jSONObject.put("mMimeType", this.A06);
        jSONObject.put("mSegmentType", this.A04.A00);
        jSONObject.put("mSegmentId", this.A00);
        jSONObject.put("mSegmentStartOffset", this.A03);
        jSONObject.put("mEstimatedFileSize", this.A01);
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A04, Integer.valueOf(this.A00), this.A06, Long.valueOf(this.A03), Long.valueOf(this.A01)});
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("mSegmentType", this.A04.name());
        hashMap.put("mSegmentId", String.valueOf(this.A00));
        String path = this.A05.getPath();
        C14360o3.A07(path);
        hashMap.put("filePath", path);
        hashMap.put("mFileSize", String.valueOf(this.A02));
        hashMap.put("mMimeType", this.A06);
        hashMap.put("mSegmentStartOffset", String.valueOf(this.A03));
        hashMap.put("mEstimatedFileSize", String.valueOf(this.A01));
        return hashMap.toString();
    }

    public W62(JSONObject jSONObject) {
        VDT vdt;
        this.A05 = new File(jSONObject.getString("filePath"));
        String string = jSONObject.getString("mFileSize");
        C14360o3.A07(string);
        this.A02 = Long.parseLong(string);
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
        this.A04 = vdt;
        String string3 = jSONObject.getString("mSegmentId");
        C14360o3.A07(string3);
        this.A00 = Integer.parseInt(string3);
        String string4 = jSONObject.getString("mMimeType");
        C14360o3.A07(string4);
        this.A06 = string4;
        String string5 = jSONObject.getString("mSegmentStartOffset");
        C14360o3.A07(string5);
        this.A03 = Long.parseLong(string5);
        String string6 = jSONObject.getString("mEstimatedFileSize");
        C14360o3.A07(string6);
        this.A01 = Long.parseLong(string6);
    }

    public W62(VDT vdt, File file, String str, int i, long j, long j2, long j3) {
        AbstractC167017dG.A1Q(file, vdt);
        C14360o3.A0B(str, 5);
        this.A05 = file;
        this.A02 = j;
        this.A04 = vdt;
        this.A00 = i;
        this.A06 = str;
        this.A03 = j2;
        this.A01 = j3;
    }
}
