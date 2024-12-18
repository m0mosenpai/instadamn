package X;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.moments.data.StandaloneMomentsDataSource;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Pg0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57526Pg0 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57526Pg0(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, int i) {
        return C1XM.A00(new C57526Pg0(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        ArrayList A1E;
        String string;
        switch (this.A00) {
            case 0:
                return new C8KR((UserSession) this.A01);
            case 1:
                C54994OUd c54994OUd = (C54994OUd) this.A01;
                String str3 = c54994OUd.A07;
                long j = c54994OUd.A01;
                int i = c54994OUd.A00;
                return new MsysPendingRecipient(c54994OUd.A02, c54994OUd.A03, c54994OUd.A04, str3, c54994OUd.A09, c54994OUd.A05, c54994OUd.A08, c54994OUd.A06, i, j, c54994OUd.A0H, c54994OUd.A0B, c54994OUd.A0G, c54994OUd.A0A, c54994OUd.A0F, c54994OUd.A0C, c54994OUd.A0D, c54994OUd.A0E);
            case 2:
                C9CI c9ci = (C9CI) this.A01;
                String str4 = c9ci.A06;
                if (str4 != null) {
                    return new C83693oE(str4);
                }
                List list = (List) c9ci.A01;
                if (list != null) {
                    return new C122145g6(list);
                }
                Number number = (Number) c9ci.A04;
                if (number != null && (str2 = c9ci.A07) != null) {
                    return new MsysThreadId(AbstractC46863Knw.A00(str2), (Long) c9ci.A03, number.longValue());
                }
                List list2 = (List) c9ci.A02;
                if (list2 != null && (str = c9ci.A07) != null) {
                    ArrayList A0q = AbstractC167017dG.A0q(list2);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        A0q.add(((C54994OUd) it.next()).A0I.getValue());
                    }
                    return new C23974Ak9(AbstractC46863Knw.A00(str), A0q);
                }
                throw AbstractC166987dD.A14("Invalid ThreadTargetJson");
            case 3:
                InterfaceC09390do interfaceC09390do = ((C26000Beo) this.A01).A05;
                java.util.Set<String> queryParameterNames = ((android.net.Uri) AbstractC166987dD.A17(interfaceC09390do)).getQueryParameterNames();
                ArrayList A10 = AbstractC31174DnI.A10(queryParameterNames);
                Iterator<String> it2 = queryParameterNames.iterator();
                while (it2.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it2);
                    String queryParameter = ((android.net.Uri) AbstractC166987dD.A17(interfaceC09390do)).getQueryParameter(A1B);
                    if (queryParameter != null) {
                        AbstractC166997dE.A1R(A1B, queryParameter, A10);
                    }
                }
                return AbstractC06930Yk.A08(A10);
            case 4:
                return AbstractC08820cl.A03(AnonymousClass001.A0R("ig://", ((C26000Beo) this.A01).A03));
            case 5:
                Object obj = EnumC53242Ngf.A01.get(((android.net.Uri) AbstractC166987dD.A17(((C26000Beo) this.A01).A05)).getHost());
                if (obj != null) {
                    return obj;
                }
                throw AbstractC166997dE.A0g();
            case 6:
                StandaloneMomentsDataSource standaloneMomentsDataSource = (StandaloneMomentsDataSource) this.A01;
                return MSW.A1H(new PZF(standaloneMomentsDataSource, null, 27), standaloneMomentsDataSource.A01);
            case 7:
                return new C73133Po((UserSession) this.A01);
            case 8:
                C51283Ml6 c51283Ml6 = (C51283Ml6) this.A01;
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51283Ml6.A00.findViewById(R.id.title);
            case 9:
                C51340Mm1 c51340Mm1 = (C51340Mm1) this.A01;
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51340Mm1.A00.findViewById(R.id.request_review_button);
            case 10:
                C51340Mm1 c51340Mm12 = (C51340Mm1) this.A01;
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51340Mm12.A00.findViewById(R.id.appealability_reason);
            case 11:
                C51340Mm1 c51340Mm13 = (C51340Mm1) this.A01;
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51340Mm13.A00.findViewById(R.id.layout_container);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C51340Mm1 c51340Mm14 = (C51340Mm1) this.A01;
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return c51340Mm14.A00.findViewById(R.id.title);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C56136Ovw((UserSession) this.A01);
            case 14:
                return new C34668FPd((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                return AbstractC35078Fcp.A00(AbstractC166987dD.A0r(((N6E) this.A01).A02));
            case 16:
                return AbstractC35078Fcp.A00(AbstractC166987dD.A0r(((N69) this.A01).A03));
            case 17:
                return AbstractC35078Fcp.A00(AbstractC166987dD.A0r(((N63) this.A01).A04));
            case 18:
                return AbstractC35078Fcp.A00(AbstractC166987dD.A0r(((N6G) this.A01).A0C));
            case Process.SIGSTOP /* 19 */:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    return bundle.getString("ARGUMENT_ENTRY_EXTRA");
                }
                return null;
            case 20:
                Bundle bundle2 = ((Fragment) this.A01).mArguments;
                if (bundle2 != null && (string = bundle2.getString("ARGUMENT_ENTRY_POINT")) != null) {
                    return string;
                }
                return "UNKNOWN";
            case 21:
                return C56034Ou6.A00(this.A01, 20);
            case 22:
                return C56034Ou6.A00(this.A01, 21);
            case 23:
                Bundle bundle3 = ((Fragment) this.A01).mArguments;
                if (bundle3 != null) {
                    return bundle3.getString("ARGUMENT_PROGRAM_TYPE");
                }
                return null;
            case 24:
                return new C51157Mj0(AbstractC166987dD.A0r(((N6G) this.A01).A0C));
            case 25:
            case 32:
            case 39:
                return this.A01;
            case 26:
            case 33:
            case 40:
                return AbstractC25226BEj.A1C(this.A01);
            case 27:
            case 34:
            case Seq.NULL_REFNUM /* 41 */:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 28:
                return C023409i.A0A.A06(AbstractC31179DnN.A04(this.A01));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC23021Ah.A00(((C54813OKo) this.A01).A01);
            case 30:
                return new C51153Miw((N5G) this.A01);
            case 31:
                N5G n5g = (N5G) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(n5g.A04);
                UserMonetizationProductType userMonetizationProductType = n5g.A00;
                if (userMonetizationProductType == null) {
                    C14360o3.A0F("productType");
                    throw C00O.createAndThrow();
                }
                return new NC1(userMonetizationProductType, A0r);
            case 35:
                return new C75473aE((UserSession) this.A01);
            case 36:
                return new NBA(AbstractC166987dD.A0r(((C45441KAc) this.A01).A07));
            case 37:
                return new C215649gg(AbstractC166987dD.A0r(((C45441KAc) this.A01).A07));
            case 38:
                return AbstractC25235BEs.A0U(this.A01);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                MusicSearchPlaylist musicSearchPlaylist = (MusicSearchPlaylist) this.A01;
                List Bfr = musicSearchPlaylist.A00().Bfr();
                if (Bfr != null) {
                    A1E = AbstractC167017dG.A0q(Bfr);
                    Iterator it3 = Bfr.iterator();
                    while (it3.hasNext()) {
                        A1E.add(new C38061Goo((JL3) it3.next()));
                    }
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                Iterator it4 = A1E.iterator();
                while (it4.hasNext()) {
                    JIN A00 = ((C38061Goo) it4.next()).A00();
                    if (A00 != null) {
                        A00.EPU(musicSearchPlaylist.A00().Aal());
                    }
                }
                return A1E;
            case 43:
                return AbstractC37301Gc2.A0T(((BOM) this.A01).A0A.getResources(), R.dimen.achievements_only_you_bottom_margin);
            case 44:
                Drawable drawable = ((BOM) this.A01).A0A.getDrawable(R.drawable.default_album_art_icon);
                C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                return ((BitmapDrawable) drawable).getBitmap();
            case 45:
                return Integer.valueOf(AbstractC167017dG.A0E(((BOM) this.A01).A0A));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return new C56143Ow7((UserSession) this.A01);
            case 47:
                return AbstractC38075Gp4.A00(AbstractC166997dE.A0L(((C41059IGc) this.A01).A00), R.drawable.top_trending);
            case 48:
                return AbstractC38075Gp4.A00(AbstractC166997dE.A0L(((C41059IGc) this.A01).A00), R.drawable.clips_trending_arrow);
            case 49:
                AMp aMp = (AMp) this.A01;
                Fragment fragment = (Fragment) aMp.A0P.get();
                if (fragment != null) {
                    return MSW.A0F(new NBA(aMp.A0I), fragment.requireActivity()).A00(C50904MeZ.class);
                }
                return null;
        }
    }
}
