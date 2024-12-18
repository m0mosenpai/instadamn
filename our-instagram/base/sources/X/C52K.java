package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.MediaNoteMimicryTrigger;
import com.instagram.api.schemas.MediaNoteMimicryType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.52K, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C52K {
    public static C52N parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            MediaNoteMimicryType mediaNoteMimicryType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("triggers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            MediaNoteMimicryTrigger mediaNoteMimicryTrigger = (MediaNoteMimicryTrigger) MediaNoteMimicryTrigger.A01.get(A1P2);
                            if (mediaNoteMimicryTrigger == null) {
                                mediaNoteMimicryTrigger = MediaNoteMimicryTrigger.A06;
                            }
                            arrayList.add(mediaNoteMimicryTrigger);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    mediaNoteMimicryType = (MediaNoteMimicryType) MediaNoteMimicryType.A01.get(A1P);
                    if (mediaNoteMimicryType == null) {
                        mediaNoteMimicryType = MediaNoteMimicryType.A06;
                    }
                }
                c16l.A0z();
            }
            return new C52N(mediaNoteMimicryType, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
