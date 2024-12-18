package X;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222419ri extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "UniversalCreationQuickCameraFragment";
    public boolean A02;
    public boolean A03;
    public long A04;
    public RectF A05;
    public C81K A06;
    public PendingRecipient A07;
    public C3PO A08;
    public C48672Ll A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final List A0F = AbstractC166987dD.A1F(AbstractC166987dD.A1J(C208509Kk.A00));
    public C22P A00 = C22P.A43;
    public String A01 = "stories_precapture_camera";

    @Override // X.AbstractC67881V0m
    public final C81J A02(ViewGroup viewGroup) {
        long j;
        C14360o3.A0B(viewGroup, 0);
        HashSet A1H = AbstractC166987dD.A1H();
        if (this.A03) {
            A1H.add(C128535rM.A00);
            A1H.add(C208509Kk.A00);
            A1H.add(C81U.A00);
            A1H.add(C81S.A00);
        } else {
            A1H.addAll(this.A0F);
        }
        C55U c55u = (C55U) this.A0F.get(0);
        C81J A01 = C81J.A01();
        C81J.A0H(A01, new C23765Afc(this, 15), this);
        C81P c81p = C81O.A02;
        C14360o3.A06(super.A00);
        C81O A012 = c81p.A01(A1H);
        A012.getClass();
        A01.A0W = A012;
        boolean z = false;
        if (c55u != C81S.A00) {
            z = true;
        }
        C81J.A08(viewGroup, A01, this, z);
        C81J.A0A(this.A00, this, A01);
        A01.A3H = true;
        A01.A47 = true;
        C81J.A0F(A01);
        A01.A3Q = true;
        A01.A3N = true;
        A01.A3f = true;
        A01.A1S = this.A07;
        A01.A25 = Boolean.valueOf(this.A0E);
        A01.A2o = this.A0C;
        A01.A2d = this.A0A;
        A01.A3c = this.A02;
        A01.A3J = true;
        RectF rectF = this.A05;
        if (rectF != null) {
            j = 0;
            A01.A06 = rectF;
            A01.A07 = rectF;
            A01.A3r = false;
            A01.A3v = true;
            A01.A33 = false;
        } else {
            j = 0;
            A01.A06 = null;
            A01.A07 = null;
            A01.A3r = false;
            A01.A3v = false;
            A01.A33 = true;
        }
        A01.A04 = j;
        A39.A00(null, C82R.A00(c55u, new C81W[0]), A01, null, null, null, null, null);
        C81K c81k = this.A06;
        if (c81k == null) {
            if (this.A07 != null) {
                c81k = C81K.A05;
            } else {
                c81k = C81K.A02;
            }
        }
        A01.A0y = c81k;
        A01.A3g = true;
        C3PO c3po = this.A08;
        if (c3po != null) {
            A01.A1w = c3po;
        }
        String str = this.A0B;
        if (str != null) {
            A01.A2n = str;
        }
        A01.A2B = Long.valueOf(this.A04);
        return A01;
    }

    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C48672Ll c48672Ll = new C48672Ll(C12L.A00);
        this.A09 = c48672Ll;
        c48672Ll.A00(requireActivity(), getViewLifecycleOwner(), new C9MH(this, 2), true);
    }

    public static final void A00(C222419ri c222419ri) {
        if (c222419ri.A0D) {
            InterfaceC53722dB A00 = AbstractC54852fj.A00();
            if (A00 instanceof InterfaceC53742dD) {
                InterfaceC53742dD interfaceC53742dD = (InterfaceC53742dD) A00;
                interfaceC53742dD.FBp(new PositionConfig(null, null, null, "media_posted_to_feed", null, null, null, null, null, null, null, null, null, 0.0f, 0, false));
                AbstractC72153Lo.A00 = true;
                interfaceC53742dD.EfJ(C1QO.A0C);
                c222419ri.requireActivity().finish();
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1) {
            A00(this);
            if (this.A02) {
                InterfaceC53722dB A00 = AbstractC54852fj.A00();
                if (A00 instanceof InterfaceC53742dD) {
                    AbstractC72153Lo.A00 = true;
                    ((InterfaceC53742dD) A00).EfJ(C1QO.A0E);
                    requireActivity().finish();
                }
            }
        }
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(169235867);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(MSV.A00(367));
            if (stringArrayList != null && !stringArrayList.isEmpty()) {
                List list = this.A0F;
                list.clear();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    list.add(AbstractC171987lT.A00(AbstractC166987dD.A1B(it)));
                }
                Object A16 = AbstractC166987dD.A16(list);
                if (A16 == C208509Kk.A00) {
                    str = "stories_precapture_camera";
                } else if (A16 instanceof C81V) {
                    str = "clips_precapture_camera";
                } else if (A16 == C81S.A00) {
                    str = "live_precapture_camera";
                }
                this.A01 = str;
            }
            this.A07 = (PendingRecipient) bundle2.getParcelable(AbstractC111324zv.A00(78));
            this.A02 = bundle2.getBoolean(MSV.A00(54), false);
            this.A0D = bundle2.getBoolean(AbstractC111324zv.A00(2746));
            String A00 = AbstractC111324zv.A00(496);
            if (bundle2.getSerializable(A00) != null) {
                this.A06 = (C81K) bundle2.getSerializable(A00);
            }
            this.A05 = (RectF) bundle2.getParcelable("camera_entry_bounds");
            String A002 = AbstractC111324zv.A00(2183);
            String str2 = "";
            if (bundle2.getString(A002) != null) {
                String string = bundle2.getString(A002);
                if (string == null) {
                    string = "";
                }
                this.A0C = string;
            }
            if (bundle2.getSerializable("camera_entry_point") != null) {
                this.A00 = (C22P) bundle2.getSerializable("camera_entry_point");
            }
            String A003 = AbstractC111324zv.A00(643);
            if (bundle2.getString(A003) != null) {
                String string2 = bundle2.getString(A003);
                if (string2 == null) {
                    string2 = "";
                }
                this.A08 = AbstractC109134vd.A01(string2);
            }
            if (bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_LIVE_TITLE") != null) {
                String string3 = bundle2.getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_LIVE_TITLE");
                if (string3 == null) {
                    string3 = "";
                }
                this.A0B = string3;
            }
            String A004 = AbstractC111324zv.A00(1660);
            if (bundle2.getString(A004) != null) {
                this.A0E = bundle2.getBoolean(A004);
            }
            this.A04 = bundle2.getLong("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_NOTE_ID", 0L);
            this.A03 = bundle2.getBoolean(AbstractC111324zv.A00(1266), false);
            if (bundle2.getString("quick_snap_initial_user_id") != null) {
                String string4 = bundle2.getString("quick_snap_initial_user_id");
                if (string4 != null) {
                    str2 = string4;
                }
                this.A0A = str2;
            }
        }
        C0f9.A09(257130834, A02);
    }

    @Override // X.AbstractC67881V0m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-438675455);
        super.onResume();
        AbstractC167007dF.A0z(this, new RunnableC24525Ati(this));
        C0f9.A09(1510989467, A02);
    }
}
