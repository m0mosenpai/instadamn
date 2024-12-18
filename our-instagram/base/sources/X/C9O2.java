package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.text.TextColorScheme;

/* renamed from: X.9O2, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9O2 {
    public static final int A00(C22P c22p, C81J c81j, C8FA c8fa) {
        CameraTool cameraTool;
        Integer num;
        String str;
        C14360o3.A0B(c22p, 0);
        boolean A1W = AbstractC167007dF.A1W(c81j.A1C);
        boolean A1W2 = AbstractC167007dF.A1W(c81j.A0o);
        boolean A1W3 = AbstractC167007dF.A1W(c81j.A15);
        boolean A1W4 = AbstractC167007dF.A1W(c81j.A1t);
        boolean A1W5 = AbstractC167007dF.A1W(c81j.A1D);
        boolean A1X = AbstractC167007dF.A1X(C22P.A2g, c81j.A0B);
        GenAIToolInfoDict genAIToolInfoDict = c81j.A0I;
        if (genAIToolInfoDict != null) {
            cameraTool = genAIToolInfoDict.A00;
        } else {
            cameraTool = null;
        }
        boolean A1W6 = AbstractC167007dF.A1W(AbstractC207699Gz.A00(cameraTool));
        if (A1X) {
            return 26;
        }
        if (AbstractC189418aK.A02(c22p)) {
            return 2;
        }
        if (c22p != C22P.A2V && c22p != C22P.A2U && c22p != C22P.A4v && c22p != C22P.A2W) {
            if (!A1W && !A1W2 && !A1W3) {
                if (A1W4) {
                    return 8;
                }
                if (c22p == C22P.A3Q) {
                    return 24;
                }
                if (c22p == C22P.A37) {
                    return 108;
                }
                if (A1W5) {
                    if (c22p != C22P.A0O) {
                        return 10;
                    }
                    return 3;
                }
                if (c22p == C22P.A0K) {
                    return 32;
                }
                if (A1W6) {
                    return 1;
                }
                if (c8fa != null) {
                    if (c8fa instanceof C218919m1) {
                        num = ((C218919m1) c8fa).A01;
                    } else if (c8fa instanceof C218929m2) {
                        num = C05F.A0U;
                    } else if (c8fa instanceof C218979m7) {
                        num = C05F.A0E;
                    } else if (c8fa instanceof C218969m6) {
                        num = C05F.A0A;
                    } else if (c8fa instanceof C218959m5) {
                        num = C05F.A09;
                    } else if (c8fa instanceof C218949m4) {
                        num = C05F.A0H;
                    } else if (c8fa instanceof C8G2) {
                        num = ((C8G2) c8fa).A00;
                    } else if (c8fa instanceof C218789lo) {
                        num = C05F.A0B;
                    } else {
                        if (!(c8fa instanceof C218899lz)) {
                            if (c8fa instanceof C218939m3) {
                                if (!((C218939m3) c8fa).A01.A06) {
                                    num = C05F.A0O;
                                }
                            } else if (c8fa instanceof C218709lg) {
                                num = C05F.A0S;
                            } else if (!(c8fa instanceof C218699lf) && !(c8fa instanceof C218779ln)) {
                                if (!(c8fa instanceof C218769lm)) {
                                    if (c8fa instanceof C218839lt) {
                                        num = C05F.A0M;
                                    } else if (!(c8fa instanceof C218829ls)) {
                                        if (c8fa instanceof C218889ly) {
                                            num = C05F.A00;
                                        } else if (c8fa instanceof C218909m0) {
                                            num = C05F.A0F;
                                        } else if (c8fa instanceof C218819lr) {
                                            num = C05F.A0D;
                                        } else if (c8fa instanceof C218879lx) {
                                            num = C05F.A02;
                                        } else if (c8fa instanceof C218759ll) {
                                            num = C05F.A0T;
                                        } else if (c8fa instanceof C218869lw) {
                                            num = C05F.A15;
                                        } else if (c8fa instanceof C218859lv) {
                                            num = C05F.A0G;
                                        } else if (c8fa instanceof C218689le) {
                                            num = C05F.A0j;
                                        } else if (c8fa instanceof C218749lk) {
                                            num = C05F.A0Y;
                                        } else if (c8fa instanceof C218739lj) {
                                            num = C05F.A0J;
                                        } else if (c8fa instanceof C218729li) {
                                            num = C05F.A0C;
                                        } else if (!(c8fa instanceof C218809lq) && !(c8fa instanceof C218799lp)) {
                                            if (c8fa instanceof C218849lu) {
                                                num = C05F.A1F;
                                            } else {
                                                num = C05F.A1I;
                                            }
                                        } else {
                                            num = C05F.A06;
                                        }
                                    }
                                }
                                num = C05F.A03;
                            } else {
                                num = C05F.A04;
                            }
                        }
                        num = C05F.A07;
                    }
                    int intValue = num.intValue();
                    switch (intValue) {
                        case 2:
                            return 9;
                        case 3:
                            return 16;
                        case 4:
                            return 11;
                        case 5:
                            return 12;
                        case 6:
                            return 23;
                        case 7:
                        case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        case 14:
                        case 17:
                        case 18:
                        case 21:
                        case 23:
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        default:
                            switch (intValue) {
                                case 1:
                                    str = "CLIPS_PROMPT";
                                    break;
                                case 2:
                                    str = "COUNTDOWN";
                                    break;
                                case 3:
                                    str = "CREATOR_FAN_ENGAGEMENT";
                                    break;
                                case 4:
                                    str = "FUNDRAISER_DUPLICATE";
                                    break;
                                case 5:
                                    str = "FUNDRAISER_THANKS";
                                    break;
                                case 6:
                                    str = "GROUP_PROFILE";
                                    break;
                                case 7:
                                    str = "HASHTAG";
                                    break;
                                case 8:
                                    str = "JOIN_CHAT";
                                    break;
                                case 9:
                                    str = "CHANNEL_CHALLENGE";
                                    break;
                                case 10:
                                    str = "LINK";
                                    break;
                                case 11:
                                    str = "PROMPT";
                                    break;
                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                    str = "QUESTION_RESPONSE";
                                    break;
                                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                    str = AbstractC111324zv.A00(685);
                                    break;
                                case 14:
                                    str = "REELS_VISUAL_REPLIES";
                                    break;
                                case Process.SIGTERM /* 15 */:
                                    str = "SMB_SUPPORT";
                                    break;
                                case 16:
                                    str = "STANDALONE_FUNDRAISER";
                                    break;
                                case 17:
                                    str = "SUBSCRIBER_CHAT";
                                    break;
                                case 18:
                                    str = "SUBSCRIPTIONS_PROMO";
                                    break;
                                case Process.SIGSTOP /* 19 */:
                                    str = "SUPPORT_PERSONALIZED_ADS";
                                    break;
                                case 20:
                                    str = "UPCOMING_EVENT";
                                    break;
                                case 21:
                                    str = "USER_PAY_BADGES_THANKS";
                                    break;
                                case 22:
                                    str = "MENTION";
                                    break;
                                case 23:
                                    str = "GROUP_MENTION";
                                    break;
                                case 24:
                                    str = "SUPERLATIVE_STORY";
                                    break;
                                case 25:
                                    str = "EVENT";
                                    break;
                                case 26:
                                    str = "FOLLOWER_MILESTONE";
                                    break;
                                case 27:
                                    str = "STORIES_TEMPLATES";
                                    break;
                                case 28:
                                    str = "TEXT";
                                    break;
                                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                                    str = "NOTIFY_ME";
                                    break;
                                case 30:
                                    str = "PROFILE";
                                    break;
                                case 31:
                                    str = "PROFILE_CARD";
                                    break;
                                case 32:
                                    str = "MUSIC_PICK";
                                    break;
                                case 33:
                                    str = "ACHIEVEMENTS";
                                    break;
                                case 34:
                                    str = "SHARE_PLATFORM";
                                    break;
                                case 35:
                                    str = "INTERNAL";
                                    break;
                                case 36:
                                    str = "QUICK_SNAP_RECAP";
                                    break;
                                default:
                                    str = "AUTO_IMPORT_MUSIC";
                                    break;
                            }
                            throw AbstractC166987dD.A1D(AnonymousClass001.A0R("Unhandled sticker share type: ", str));
                        case 8:
                            return 27;
                        case 9:
                            return 62;
                        case 10:
                            return 21;
                        case 11:
                            return 17;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            return 6;
                        case Process.SIGTERM /* 15 */:
                            return 14;
                        case 16:
                            return 22;
                        case Process.SIGSTOP /* 19 */:
                            return 15;
                        case 20:
                            return 20;
                        case 22:
                            return 5;
                        case 24:
                            return 30;
                        case 25:
                            return 28;
                        case 26:
                            return 29;
                        case 27:
                            C1816683y c1816683y = c81j.A12;
                            if (c1816683y != null && c1816683y.A05) {
                                return 33;
                            }
                            return 61;
                        case 28:
                            return 31;
                        case 30:
                            return 109;
                        case 31:
                            return 112;
                        case 36:
                            return 113;
                    }
                }
                return 0;
            }
            return 4;
        }
        return 5;
    }

    public static final void A01(C81J c81j, C183978Ee c183978Ee, int i) {
        GenAIToolInfoDict genAIToolInfoDict;
        C81M c81m;
        int i2;
        int i3;
        C14360o3.A0B(c183978Ee, 0);
        c183978Ee.A0Y = c81j.A2H;
        c183978Ee.A0n = c81j.A2e;
        c183978Ee.A08 = i;
        c183978Ee.A0X = c81j.A2G;
        c183978Ee.A0w = c81j.A3I;
        if (c81j.A1e != null && (c81m = c81j.A0w) != null) {
            C18160v1 c18160v1 = null;
            int i4 = c81m.A01;
            if (i4 >= 0 && i4 < c81m.A0A.size()) {
                i2 = c81m.A01;
            } else {
                i2 = 0;
            }
            if (((TextColorScheme) c81m.A0A.get(i2)).A06 != null) {
                C81M c81m2 = c81j.A0w;
                if (c81m2 != null) {
                    int i5 = c81m2.A01;
                    if (i5 >= 0 && i5 < c81m2.A0A.size()) {
                        i3 = c81m2.A01;
                    } else {
                        i3 = 0;
                    }
                    c18160v1 = A2V.A00((TextColorScheme) c81m2.A0A.get(i3));
                }
                c183978Ee.A0I = c18160v1;
            }
        }
        if (c81j.A1U != null) {
            c183978Ee.A0y = true;
        }
        if (c183978Ee.A0p == null && (genAIToolInfoDict = c81j.A0I) != null) {
            c183978Ee.A0p = AbstractC166987dD.A1J(new OTK(genAIToolInfoDict.A00, AbstractC53923Nsw.A00(genAIToolInfoDict)));
        }
        if (c81j.A23.booleanValue()) {
            c183978Ee.A0y = true;
            c183978Ee.A1A = true;
        }
    }
}
