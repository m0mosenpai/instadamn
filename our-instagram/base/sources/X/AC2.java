package X;

import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AC2 {
    public final InterfaceC49612Pu A00;
    public final HashMap A01 = AbstractC166987dD.A1G();

    public final File A00(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC49612Pu interfaceC49612Pu = this.A00;
        File file = new File(interfaceC49612Pu.C5c(), AnonymousClass001.A0g("sfx_audio_", str, ".mp3"));
        String canonicalPath = file.getCanonicalPath();
        C14360o3.A07(canonicalPath);
        String canonicalPath2 = interfaceC49612Pu.C5c().getCanonicalPath();
        C14360o3.A07(canonicalPath2);
        if (canonicalPath.startsWith(canonicalPath2)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        }
        C0w9.A01(EnumC12410kj.A0B, "SFXAudioCache:getSfxFile", "illegal directory path provided while creating file");
        throw AbstractC167007dF.A0c("illegal directory path provided while creating file - ", file.getCanonicalPath());
    }

    public final boolean A01(String str) {
        C211729Zg c211729Zg;
        String str2;
        C14360o3.A0B(str, 0);
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(str) || (c211729Zg = (C211729Zg) hashMap.get(str)) == null || (str2 = c211729Zg.A04) == null || !AbstractC166987dD.A11(str2).exists()) {
            return false;
        }
        return true;
    }

    public AC2(InterfaceC49612Pu interfaceC49612Pu) {
        this.A00 = interfaceC49612Pu;
    }
}
