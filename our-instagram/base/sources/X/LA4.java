package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* loaded from: classes8.dex */
public final class LA4 {
    public final C2EC A00;
    public final C45090JxK A01;
    public final Integer A02;

    public LA4(C2EC c2ec, C45090JxK c45090JxK, Integer num) {
        C14360o3.A0B(num, 2);
        this.A01 = c45090JxK;
        this.A02 = num;
        this.A00 = c2ec;
    }

    public final String A00() {
        int intValue = this.A01.A04.intValue();
        if (intValue != 4 && intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2 && intValue != 3) {
                    throw B4Z.A00();
                }
                return "direct_v2_delete_item";
            }
            return AbstractC111324zv.A00(4314);
        }
        return "direct_v2_message";
    }

    public final String A01() {
        String str;
        C2EC c2ec;
        String str2;
        Uri.Builder path = new Uri.Builder().path(MSV.A00(195));
        C45090JxK c45090JxK = this.A01;
        MNQ mnq = c45090JxK.A02;
        if (!(mnq instanceof C49243Lpy) && !C45282K2k.A00(mnq, 0) && !C45282K2k.A00(mnq, 1) && ((c2ec = this.A00) == null || c2ec.C7g() != 29)) {
            int intValue = c45090JxK.A04.intValue();
            if (intValue != 2 && intValue != 3) {
                str2 = "x";
            } else {
                str2 = "dx";
            }
            path.appendQueryParameter(str2, c45090JxK.A07);
        }
        int intValue2 = c45090JxK.A04.intValue();
        if (intValue2 != 2 && intValue2 != 3) {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        } else {
            str = "did";
        }
        return AbstractC166987dD.A19(path.appendQueryParameter(str, c45090JxK.A0A).build());
    }

    public final String A02() {
        Integer num;
        C2EC c2ec = this.A00;
        if (c2ec != null && c2ec.C7g() == 29 && ((num = this.A01.A04) == C05F.A00 || num == C05F.A01)) {
            return "direct_v2_broadcast_chat_new_message";
        }
        C45090JxK c45090JxK = this.A01;
        Integer num2 = c45090JxK.A04;
        if (num2 != C05F.A0C && num2 != C05F.A0N) {
            MNQ mnq = c45090JxK.A02;
            if (mnq instanceof C45280K2i) {
                int intValue = ((C45280K2i) mnq).A00.intValue();
                if (intValue == 0 || intValue == 4) {
                    return "direct_v2_text";
                }
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3) {
                            return "direct_v2_gift_text";
                        }
                        throw B4Z.A00();
                    }
                } else {
                    return "direct_v2_generic";
                }
            } else if (!C45282K2k.A00(mnq, 0) && !C45282K2k.A00(mnq, 1)) {
                if (!(mnq instanceof C49243Lpy)) {
                    if (C45283K2l.A00(mnq, 0)) {
                        List list = (List) ((C45283K2l) mnq).A01;
                        if (list.size() == 1) {
                            switch (((EnumC46179KcH) list.get(0)).ordinal()) {
                                case 0:
                                case 1:
                                    break;
                                case 2:
                                case 3:
                                    return "direct_v2_raven";
                                case 4:
                                    return "direct_v2_gif";
                                case 5:
                                    return "direct_v2_sticker";
                                case 6:
                                    return "direct_v2_voice_message";
                                default:
                                    throw B4Z.A00();
                            }
                        }
                        return "direct_v2_media";
                    }
                    if (mnq instanceof C45281K2j) {
                        C45281K2j c45281K2j = (C45281K2j) mnq;
                        switch (c45281K2j.A03.ordinal()) {
                            case 0:
                                int ordinal = c45281K2j.A02.ordinal();
                                if (ordinal != 3) {
                                    if (ordinal != 0) {
                                        if (ordinal != 2) {
                                            if (ordinal != 1) {
                                                return null;
                                            }
                                            return "direct_v2_reel_mention";
                                        }
                                        return "direct_v2_reel_reaction";
                                    }
                                    return "direct_v2_story_share";
                                }
                                return "direct_v2_reel_share";
                            case 1:
                                return "direct_v2_clips_share";
                            case 2:
                                return "direct_v2_media_share";
                            case 3:
                                return "direct_v2_profile_share";
                            case 4:
                                return "direct_v2_location_share";
                            case 5:
                                return "direct_v2_ar_effect_share";
                            case 6:
                                return "direct_v2_note_reply";
                            default:
                                throw B4Z.A00();
                        }
                    }
                    if (C45283K2l.A00(mnq, 1)) {
                        int ordinal2 = ((EnumC101664hb) ((C45283K2l) mnq).A01).ordinal();
                        if (ordinal2 != 8) {
                            if (ordinal2 != 9) {
                                return null;
                            }
                            return "direct_raven_replayed";
                        }
                        return "direct_raven_screenshot";
                    }
                    if (C45282K2k.A00(mnq, 2)) {
                        return "direct_v2_default";
                    }
                    throw B4Z.A00();
                }
            } else {
                return "direct_v2_user_reaction";
            }
            return "direct_v2_like";
        }
        return "direct_v2_delete_item";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r0 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String A03() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LA4.A03():java.lang.String");
    }
}
