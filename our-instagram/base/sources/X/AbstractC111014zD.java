package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.RIXUActionSource;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.RIXUPlayType;
import com.instagram.api.schemas.RIXUTextLinkImpl;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111014zD {
    public static C111094zQ parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        String A1P8;
        String A1P9;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            RIXUActionSource rIXUActionSource = null;
            C51757Mtg c51757Mtg = null;
            RIXUAspectRatio rIXUAspectRatio = null;
            Boolean bool = null;
            C206309Bn c206309Bn = null;
            ArrayList arrayList = null;
            ClipsIFUType clipsIFUType = null;
            C38688GzT c38688GzT = null;
            RIXUCtaType rIXUCtaType = null;
            Boolean bool2 = null;
            Integer num = null;
            Boolean bool3 = null;
            String str = null;
            Boolean bool4 = null;
            C39561sd c39561sd = null;
            RIXUCoverSize rIXUCoverSize = null;
            RIXULayoutFormat rIXULayoutFormat = null;
            RIXULayoutStyle rIXULayoutStyle = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            Integer num2 = null;
            Boolean bool5 = null;
            C111074zO c111074zO = null;
            Boolean bool6 = null;
            RIXUPlayType rIXUPlayType = null;
            Boolean bool7 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool8 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("action_source".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P9 = null;
                    } else {
                        A1P9 = c16l.A1P();
                    }
                    rIXUActionSource = (RIXUActionSource) RIXUActionSource.A01.get(A1P9);
                    if (rIXUActionSource == null) {
                        rIXUActionSource = RIXUActionSource.A08;
                    }
                } else if ("additional_cover_cta".equals(A0q)) {
                    c51757Mtg = AbstractC40197HsM.parseFromJson(c16l);
                } else if ("aspect_ratio".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P8 = null;
                    } else {
                        A1P8 = c16l.A1P();
                    }
                    rIXUAspectRatio = (RIXUAspectRatio) RIXUAspectRatio.A01.get(A1P8);
                    if (rIXUAspectRatio == null) {
                        rIXUAspectRatio = RIXUAspectRatio.A06;
                    }
                } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("chaining_behavior_definition".equals(A0q)) {
                    c206309Bn = AbstractC111054zK.parseFromJson(c16l);
                } else if ("clips".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C111034zF parseFromJson = AbstractC111024zE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("clips_ifu_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P7 = null;
                    } else {
                        A1P7 = c16l.A1P();
                    }
                    clipsIFUType = (ClipsIFUType) ClipsIFUType.A01.get(A1P7);
                    if (clipsIFUType == null) {
                        clipsIFUType = ClipsIFUType.A09;
                    }
                } else if ("cover_definition".equals(A0q)) {
                    c38688GzT = AbstractC40198HsN.parseFromJson(c16l);
                } else if ("cta_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P6 = null;
                    } else {
                        A1P6 = c16l.A1P();
                    }
                    rIXUCtaType = (RIXUCtaType) RIXUCtaType.A01.get(A1P6);
                    if (rIXUCtaType == null) {
                        rIXUCtaType = RIXUCtaType.A05;
                    }
                } else if ("disable_chaining".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("hide_unit_if_seen".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_from_bloks".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("layout_cover_size".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P5 = null;
                    } else {
                        A1P5 = c16l.A1P();
                    }
                    rIXUCoverSize = (RIXUCoverSize) RIXUCoverSize.A01.get(A1P5);
                    if (rIXUCoverSize == null) {
                        rIXUCoverSize = RIXUCoverSize.A07;
                    }
                } else if ("layout_format".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    rIXULayoutFormat = (RIXULayoutFormat) RIXULayoutFormat.A01.get(A1P4);
                    if (rIXULayoutFormat == null) {
                        rIXULayoutFormat = RIXULayoutFormat.A07;
                    }
                } else if ("layout_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    rIXULayoutStyle = (RIXULayoutStyle) RIXULayoutStyle.A01.get(A1P3);
                    if (rIXULayoutStyle == null) {
                        rIXULayoutStyle = RIXULayoutStyle.A06;
                    }
                } else if ("links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            RIXUTextLinkImpl parseFromJson2 = AbstractC33734EvM.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("medias_to_render".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList3.add(A1P2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("netego_subtype".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("netego_unit".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("paging_info".equals(A0q)) {
                    c111074zO = AbstractC111064zN.parseFromJson(c16l);
                } else if ("play_preview_only_wifi".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("play_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    rIXUPlayType = (RIXUPlayType) RIXUPlayType.A01.get(A1P);
                    if (rIXUPlayType == null) {
                        rIXUPlayType = RIXUPlayType.A07;
                    }
                } else if ("show_tab_upsell_on_last_item".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("uses_multiple_songs".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("view_state_item_type".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C111094zQ(c206309Bn, c38688GzT, c51757Mtg, clipsIFUType, c111074zO, c39561sd, rIXUActionSource, rIXUAspectRatio, rIXUCoverSize, rIXUCtaType, rIXULayoutFormat, rIXULayoutStyle, rIXUPlayType, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, num, num2, num3, str, str2, str3, str4, arrayList, arrayList2, arrayList3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
