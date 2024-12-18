package X;

/* renamed from: X.RuX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61839RuX {
    public static String A00(int i) {
        if (i == 1) {
            return "ASSISTANT_INTERACTION_LATENCY";
        }
        if (i == 2) {
            return "ASSISTANT_OCULUS_VOICE_COMMAND_LATENCY";
        }
        if (i == 3) {
            return "ASSISTANT_OCULUS_ASSISTANT_STARTUP_LATENCY";
        }
        if (i == 4) {
            return "ASSISTANT_OCULUS_DICTATION_LATENCY";
        }
        switch (i) {
            case 1029:
                return "ASSISTANT_OCULUS_SMART_KEYBOARD_ASSISTANT_START_UP";
            case 1818:
                return "ASSISTANT_FRAME_ACTION_PROCESSOR_LATENCY";
            case 2518:
                return "ASSISTANT_INCOMING_MESSAGE_ANNOUNCEMENT";
            case 4019:
                return "ASSISTANT_REMOTE_ACTION_FULFILLMENT_PROCESSOR";
            case 5797:
                return "ASSISTANT_PROVIDER_INTERACTION_LATENCY";
            case 7477:
                return "ASSISTANT_ASSISTANT_NETWORK_EVENT";
            case 8229:
                return "ASSISTANT_PROVIDER_INTERACTION_FUNNEL";
            case 8977:
                return "ASSISTANT_OCULUS_SMART_KEYBOARD_LOAD_RESOURCES";
            case 9891:
                return "ASSISTANT_VOICE_TIP";
            case 10310:
                return "ASSISTANT_ASSISTANT_PARTNER_APP_LAUNCH";
            case 10891:
                return "ASSISTANT_STARTUP_LATENCY";
            case 11344:
                return "ASSISTANT_OCULUS_SMART_COMPOSE_LATENCY";
            case 13078:
                return "ASSISTANT_SYNC_CONTACT";
            case 13454:
                return "ASSISTANT_FUNNEL_INTERACTION_LATENCY";
            case 15085:
                return "ASSISTANT_RUNTIME_SANITIZER_LATENCY";
            case 15463:
                return "ASSISTANT_ASSISTANT_SMART_REPLY_LATENCY";
            case 15554:
                return "ASSISTANT_LIVE_AI_OPERATIONAL";
            case 16264:
                return "ASSISTANT_WAKE_WORD_VALIDATION_LATENCY";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
