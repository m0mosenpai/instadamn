package X;

import android.content.Context;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.Mog, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51495Mog extends OMs {
    public GltfMemoryPointerWrapper A00;
    public LiveEditingRawMemoryPointerHolder A01;
    public String A02;
    public WeakReference A03;
    public boolean A04;
    public final Context A05;
    public final C55555Olp A06;
    public final C19L A07;

    public static final void A00(C51495Mog c51495Mog) {
        if (c51495Mog.A02 != null && c51495Mog.A00 != null) {
            C55555Olp c55555Olp = c51495Mog.A0C;
            JSONObject A02 = OXf.A02("success");
            C55143Od2 c55143Od2 = c55555Olp.A00;
            if (c55143Od2 != null) {
                c55143Od2.A0D.A02.A00(A02);
                C55555Olp c55555Olp2 = c51495Mog.A06;
                String str = c51495Mog.A02;
                if (str != null) {
                    String str2 = ((OMs) c51495Mog).A03;
                    if (str2 != null) {
                        GltfMemoryPointerWrapper gltfMemoryPointerWrapper = c51495Mog.A00;
                        if (gltfMemoryPointerWrapper != null) {
                            C55143Od2 c55143Od22 = c55555Olp2.A00;
                            if (c55143Od22 != null) {
                                c55143Od22.A0E.A00.loadAvatarFromMemory(str, str2, gltfMemoryPointerWrapper);
                                return;
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            C14360o3.A0F("provider");
            throw C00O.createAndThrow();
        }
    }

    public static final void A01(C51495Mog c51495Mog) {
        LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder;
        String str = c51495Mog.A02;
        if (str != null && (liveEditingRawMemoryPointerHolder = c51495Mog.A01) != null) {
            C55555Olp c55555Olp = c51495Mog.A06;
            String str2 = ((OMs) c51495Mog).A04;
            if (str2 != null) {
                C55143Od2 c55143Od2 = c55555Olp.A00;
                if (c55143Od2 == null) {
                    C14360o3.A0F("provider");
                    throw C00O.createAndThrow();
                }
                c55143Od2.A0E.A00.loadColorRampFromMemory(str, str2, liveEditingRawMemoryPointerHolder);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51495Mog(Context context, InterfaceC58017Po2 interfaceC58017Po2, C55555Olp c55555Olp, C19L c19l) {
        super(c55555Olp);
        AbstractC167017dG.A1Q(context, c55555Olp);
        this.A05 = context;
        this.A06 = c55555Olp;
        this.A07 = c19l;
        this.A03 = AbstractC25225BEi.A16(interfaceC58017Po2);
    }
}
